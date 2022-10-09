import java.util.*;

class temp
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter Number of Temperature: ");
		int temperature = in.nextInt();

		if(temperature < 32)
		{
			System.out.println("\n-->Below Freezing");
		}
		else
		{
			System.out.println("\n-->Above Freezing");
		}
	}
}