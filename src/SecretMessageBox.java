import javax.swing.JOptionPane;

public class SecretMessageBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Set the passcode in a String variable
	String passcode="patrick";
	// 2. Using a pop-up, ask for a secret message and store it in a variable
String patrick=JOptionPane.showInputDialog("please enter a secret message");

	// 3. Ask your friend for the passcode and store it in a variable
String scoochi=JOptionPane.showInputDialog(null, "enter the passcode");

	// 4. If the passcode matches, show the secret message
if(scoochi.equals("patrick")){
	JOptionPane.showMessageDialog(null, "hi");
}

	// 5. If the passcode does not match, pop-up "INTRUDER!!"
else{JOptionPane.showMessageDialog(null, "INTRUDER!");

	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.


}


}
}