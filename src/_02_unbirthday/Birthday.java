package _02_unbirthday;

import javax.swing.JOptionPane;

public class Birthday {
public static void main(String[] args) {
 String birthday = JOptionPane.showInputDialog("What is your birthday?");
if (birthday.equals("8/5")) {
JOptionPane.showMessageDialog(null, "Happy birthday!");
}
else {
	JOptionPane.showMessageDialog(null, "Happy Unbirthday");
}
}
}
