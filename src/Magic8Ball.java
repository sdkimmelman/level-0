
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		int hi = new Random().nextInt(4);
		

		// 2. Make a variable that will hold a random number and put a random
		// number into this variable using "new Random().nextInt(4)"

		// 3. Print out this variable
System.out.println(hi);
		// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("who is Trump");
		// 5. If the random number is 0
if(hi==0){JOptionPane.showMessageDialog(null,"yes");
	
}

else if(hi==1){JOptionPane.showMessageDialog(null,"no");

}
	// -- tell the user "Yes"

		// 6. If the random number is 1

		// -- tell the user "No"

		// 7. If the random number is 2
else if(hi==2){JOptionPane.showMessageDialog(null,"Maybe you should ask Google");}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
else if(hi==3){JOptionPane.showMessageDialog(null,"You are wrong");
		// -- write your own answer
	}
}
}