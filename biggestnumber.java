import java.util.*;

public class biggestnumber
{
	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);

		System.out.print("Enter First number: ");
		int num1 = in.nextInt();
		System.out.print("Enter Second number: ");
		int num2 = in.nextInt();
		System.out.print("Enter Third number: ");
		int num3 = in.nextInt();

		if(num1 > num2 && num1 > num3)
		{
			System.out.println("\nThe greatest is: " + num1);
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("\nThe greatest is: " + num2);
		}
		else if(num3 > num1 && num3 > num2)
		{
			System.out.println("\nThe greatest is: " + num3);
		}
		else
		{
			System.out.println("Invalid");
		}

	}
}