import javax.swing.JOptionPane;

public class assignment223_the_first_input_dialog {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null, "Hi " + name + "^|^");
        System.exit(0);
    }
}