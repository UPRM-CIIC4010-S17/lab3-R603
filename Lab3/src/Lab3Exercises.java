import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Ivan Santiago De Jesus c&p");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(700, 300);
		myFrame.setSize(500, 500);
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}