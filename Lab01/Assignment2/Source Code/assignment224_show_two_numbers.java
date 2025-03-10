import javax.swing.JOptionPane;

public class assignment224_show_two_numbers {
    public static void main(String[] args) {
        String strNum1 = "", strNum2 = "";
        String strNotification = "You've just entered: ";
        
        strNum1 = JOptionPane.showInputDialog (null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null, "Plead input the second number: ", "Input the secon number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}