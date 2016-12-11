import javax.swing.JOptionPane;

public class Adventure {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"Once upon a time there was there were 2 friends named schoochimistro and wongy.\n"
						+ " Scoochimistro was very nice and awesome but wongy was rude and liked nobody"
						+ " except scoochimistro.\n One day, Scoochimistro and Wongy went out into"
						+ "the woods to look for a black bear.");
		String answer1 = JOptionPane.showInputDialog(null, "who finds the black bear?");
		if (answer1.equals("scoochimistro")) {
			JOptionPane.showMessageDialog(null, "he gets eaten");
			String answer2 = JOptionPane.showInputDialog(null, "does wongy keep the black bear?");
			if (answer2.equals("yes")){JOptionPane.showMessageDialog(null, "he keeps it as a pet");
				
			}else{
				JOptionPane.showMessageDialog(null,"it chases him into a river");
			}
			
		} else {
			
			JOptionPane.showInputDialog(null,"Scoochimistro gets eaten by the black bear while\n the black bear is chasing wongy into a river.\n Wongy swims until he sees a boat with knives and guns.");
			

			
		}
	}

}
