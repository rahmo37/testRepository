
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = harmonicMean(1);
		System.out.println(result);

	}

	public static double harmonicMean(double n) {
		//System.out.println(n);
		if (n > 0.125) {

			return n + harmonicMean(n / (n + 1));

		} else {
			return 0;
		}
	}

}
