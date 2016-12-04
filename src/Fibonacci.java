
public class Fibonacci {

	public static void main(String[] args) {
		int firstnumber = 0;
		int secondnumber = 0;
		for (int i = 0; i < 20; i++) {
			if (firstnumber == 0) {
				System.out.println(1);
				firstnumber = 1;
			} else {
				int value = firstnumber+ secondnumber;
				System.out.println(value);
				secondnumber = firstnumber;
				firstnumber = value;
			}

		}

	}

}
