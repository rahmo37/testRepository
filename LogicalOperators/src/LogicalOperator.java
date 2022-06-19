import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		{
			// And logical operator.

			System.out.println("What is the total stat of your selected pokemon?");
			int stat = sc.nextInt();

			while (stat != 0) {

				if (stat <= 500 && stat >= 400) {
					System.out.println("Good pokemon!");
				} else if (stat <= 600 && stat >= 500) {
					System.out.println("Great pokemon!!");
				} else if (stat <= 1000 && stat >= 600) {
					System.out.println("Legendary pokemon!!!");
				} else if (stat > 1000) {
					System.out.println("Stat must be between 1 to 1000");
				} else {
					System.out.println("Not very good pokemon :(");
				}
				System.out.println("What is the total stat of your selected pokemon?");
				stat = sc.nextInt();
			}
			System.out.println("GOODBYE!!");
		}

		{
			// Or logical operator

			System.out.println("Who is you favorite Bangladeshi neta??");
			String response = sc.next();

			while (!(response.equals("q") || response.equals("Q"))) {

				if (response.equalsIgnoreCase("Obaidul") || response.equalsIgnoreCase("Kader")) {

					System.out.println("Are era kara!!!! kothheke elo era!!!");
				} else {
					System.out.println("Neta not listed");
				}
				System.out.println("Who is you favorite Bangladeshi neta??");
				response = sc.next();
			}
			System.out.println("Bye now!!!");

		}

	}

}
