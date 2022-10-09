import java.util.*;

public class oddsum
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);

		int num1, num2, sum = 0;


		System.out.print("Enter 1st Number: ");
		num1 = in.nextInt();

		System.out.print("Enter 2nd Number: ");
		num2 = in.nextInt();

		while(num1 <= num2)
		{
			if(num1 %2 !=0)
			{
				sum = sum + num1;
			}
			num1++;
		}
		System.out.println("Sum of Odd numbers: " + sum);
	}
}