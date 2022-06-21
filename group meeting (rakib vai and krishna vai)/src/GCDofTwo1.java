import java.util.Scanner;
//GCD of 2 numbers
public class GCDofTwo1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Num1, Num2,Num3, i, GCD = 0;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Integer Value : ");
		Num1 = sc.nextInt();	
		
		System.out.print(" Please Enter the Second Integer Value : ");
		Num2 = sc.nextInt();
		
		System.out.print(" Please Enter the Second Integer Value : ");
		Num3 = sc.nextInt();
		
		for(i = 1; i <= Num1 && i <= Num2 && i <= Num3; i++)
	    {
	        if(Num1 % i == 0 && Num2 % i == 0 && Num3 % i == 0)
	        {
	            GCD = i;
	        }
	    }	
		System.out.println("\n GCD of " + Num1 + " " + Num2 +  " and " + Num3 + "  =  " + GCD);
	}
}
