import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class Snowflake extends JPanel{
	
	public Snowflake(){
		setPreferredSize(new Dimension(800, 1000));
		setBackground(Color.black);
		
	}
	
	public void drawSnowflake(Graphics gr, int x, int y, int size){
		int endX;
		int endY;
		Random r = new Random();
		
		if(size <= 3){
			return;
		} else {
		
			for(int i = 0; i < 6; i++){
				endX = x + (int)(size * Math.cos((2 * Math.PI / 6) * i));
				endY = y + (int)(size * Math.sin((2 * Math.PI / 6) * i));
				gr.setColor(new Color(r.nextFloat(), r.nextFloat(), r.nextFloat()));
				gr.drawLine(x, y, endX, endY);
				drawSnowflake(gr, endX, endY, size/3);
			}
		}
	}
	
	public void paintComponent(Graphics gr){
		super.paintComponent(gr);
		Random r = new Random();
		for(int i = 0; i < 100; i++){
			drawSnowflake(gr, r.nextInt(getWidth()) + 0, r.nextInt(getHeight()) + 0, r.nextInt(70) + 3);
		}
	}
	

}
