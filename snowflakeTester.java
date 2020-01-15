import javax.swing.JFrame;

public class snowflakeTester {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Let it snow!");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new Snowflake());
		frame.pack();
		frame.setVisible(true);

	}

}
