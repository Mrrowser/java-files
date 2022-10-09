import java.util.*;

class threescores
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int total, average;

		System.out.print("Enter First score: ");
		int num1 = in.nextInt();

		System.out.print("Enter Second score: ");
		int num2 = in.nextInt();

		System.out.print("Enter Third score: ");
		int num3 = in.nextInt();

		total = num1 + num2 + num3;
		average = total / 2;

		System.out.println("Your total score is: " + average);

		if(average > 90)
		{
			System.out.println("Your average is A");
			System.out.println("A is above 90");
		}
		else if(average >= 80 && average <= 89)
		{
			System.out.println("Your average is B");
			System.out.println("B is 80-89");
		}
		else if(average >= 70 && average <= 79)
		{
			System.out.println("Your average is C");
			System.out.println("C is 70-79");
		}
		else if(average >= 60 && average <= 69)
		{
			System.out.println("Your average is D");
			System.out.println("D is 60-69");
		}
		else if(average < 60)
		{
			System.out.println("Your average is E");
			System.out.println("E is below 60");
		}
		else
		{
			System.out.println("Invalid");
		}

	}
}