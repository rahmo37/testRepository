
public class DividingNumber {

	public static void main(String[] args) {
		// Sum unto 8th term hamonic mean
		// x = 1 + 1/2 + 1/3......+ 1/8

		double x = 0;

		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= 8; j++) {
				double number = (double) i / j;

				x = x + number;

			}

			System.out.printf("%.3f",x);
		}

	}

}
