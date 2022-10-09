import java.util.*;

class simpleInterest
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);



		double totalAmount, monthlyPayment;
		double percent_toDecimal;

		System.out.print("Enter Your Fullname: ");
		String name = scan.nextLine();

		System.out.print("Enter Principal Amount: ");
		double pA = in.nextDouble();//pA - Principal Amount.

		System.out.print("Enter Interest per Month: ");
		double iM = in.nextDouble();// iM - Interest per Month.

		System.out.print("Enter The months to pay: ");
		double mP = in.nextDouble(); //mP - The months to pay.

		//The value of interest per month convert to decimal.
		percent_toDecimal = iM / 100;
		//calculate of the monthly Payment.
		monthlyPayment = pA * percent_toDecimal;
		//calculate of the The total Amount to pay .
		totalAmount = (monthlyPayment * mP) + pA;

		System.out.println("\n---------------------------------------");
		//print name
		System.out.println("Fullname: " + name);
		//print monthly payment
		System.out.println("The Monthly Payment is: " + monthlyPayment);
		//print total amount
		System.out.println("The Total Amount to pay is: " + totalAmount);
		System.out.println("---------------------------------------");
	}
}