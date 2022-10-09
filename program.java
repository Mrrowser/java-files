import java.util.*;

class program
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter Celsius Temperature Value: ");
		int temp = in.nextInt();

		//if temperature greater than or equal to 100 the water is boiling.
		if(temp >= 100)
		{
			System.out.println("\n->The water is Boiling");
		}
		//if temperature is lesser than or equal to 0 it is freezing.
		else if(temp <= 0)
		{
			System.out.println("\n->It is Freezing");
		}
		//if temperature equal equal to 50 it is normal.
		else if(temp == 50)
		{
			System.out.println("\n->It is Normal");
		}
	}
}