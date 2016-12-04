import javax.swing.JOptionPane;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			String a = JOptionPane.showInputDialog("enter a number");
			int b = Integer.parseInt(a);
			if (isPrime(b)) {
				JOptionPane.showMessageDialog(null, "your number is prime");
			} else {
				JOptionPane.showMessageDialog(null, "your number is not prime");
			}
		}
	}

	private static boolean isPrime(int b) {
		if (b < 2) {
			return false;
		} else if (b == 2 || b == 3) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(b); i++) {
				if (b % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
