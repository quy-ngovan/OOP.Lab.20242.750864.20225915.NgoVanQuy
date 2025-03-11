import java.util.Scanner;
import javax.swing.JOptionPane;

public class B61_ChoosingOption {
	public static void main(String[] args) { // main + crtl + space + enter
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to ther first class ticket?");
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
		System.exit(0);
	}
}
