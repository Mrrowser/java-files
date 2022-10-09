import java.util.*;

class grade
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int finalGrade;

		System.out.print("Enter Prelim Score: ");
		int prelim = in.nextInt();

		System.out.print("Enter Midterm Score: ");
		int midterm = in.nextInt();

		System.out.print("Enter Tentative Final Score: ");
		int tentative = in.nextInt();

		finalGrade = prelim + midterm + tentative / 3;

		if(finalGrade > 75)
		{
			System.out.println("\n-->Passed");
		}
		else
		{
			System.out.println("\n-->Failed");
		}
	}
}