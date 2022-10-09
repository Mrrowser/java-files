import java.util.*;

class FirstAssignment
{

	public static void main(String[] args)
	{
		NeutralPositiveNegativeNumber();
	}
	public static void NeutralPositiveNegativeNumber()
	{
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);

		System.out.print("\nInput Integer: ");
	    int number = in.nextInt();

		if (number == 0)
		{
			System.out.println("\n" + number + " is a neutral number.");
		}
		else if (number > 0)
		{
			System.out.println("\n" + number + " is a positive number.");
		}
		else if (number < 0)
		{
			System.out.println("\n" + number + " is a negative number.");

		}
		else
	        System.out.println("Invalid");

	   //OddEven
	   if (number %2 == 0)
	   {
		   System.out.println(number + " is Even number.");
	   }
	   else
		   System.out.println(number + " is Odd number.");


	   System.out.println("\nDo you want to repeat the operation?");
	   System.out.print("Yes or No: ");
	   String again = scan.nextLine();

	   if(again.equalsIgnoreCase("Yes"))
	   {
		   NeutralPositiveNegativeNumber();
	   }
	   else
	   {
		   if (number == 0)
		   {
			   System.out.println("\n" + number + " is a neutral number.");
		   }
		   else if (number > 0)
		   {
			   System.out.println("\n" + number + " is a positive number.");
		   }
		   else if (number < 0)
		   {
			   System.out.println("\n" + number + " is a negative number.");
		   }
		   else
		   	   System.out.println("Invalid");

		  //OddEven
		  if (number %2 == 0)
		  {
			  System.out.println(number + " is Even number.");
		  }
		  else
		      System.out.println(number + " is Odd number.");

	   }
	}


}