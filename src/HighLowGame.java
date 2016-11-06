import java.util.Random;

import javax.swing.JOptionPane;


// Copyright Wintriss Technical Schools 2013
public class HighLowGame {


	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		// 2. Print out the random variable above
//		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String geuss=JOptionPane.showInputDialog("enter a number");

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int number=(Integer.parseInt(geuss));
			// 5. if the guess is correct
			if(number==random){
				// 6. win
				JOptionPane.showMessageDialog(null, "you win");
				System.exit(0);
			}
			// 7. if the guess is high
			else if(number > random){
				// 8. tell them it's too high
				JOptionPane.showMessageDialog(null, "too high");
			}
			// 9. if the guess is low
			else if(number < random){
				// 10. tell them it's too low
				JOptionPane.showMessageDialog(null, "too low");
			}

		}
		// 12. tell them they lose
		JOptionPane.showMessageDialog(null, "you lose");
	}


}

