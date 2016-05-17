import java.awt.Container;
import javax.swing.JFrame;




public class MainProgram extends JFrame {

	public MainProgram() {
		setTitle("map_1");
		Panel panel = new Panel();
		Container contentPane = getContentPane();
		contentPane.add(panel);
		pack();
        }

	public static void main(String[] args) {
		MainProgram e1 = new MainProgram();
		e1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e1.setVisible(true);
	}

}
