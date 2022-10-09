import java.util.*;

public class factorial
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);

		int i, f = 1;

		System.out.print("Enter a number: ");
		int num = in.nextInt();

		for(i = 1; i <= num; i++)
      		f=f*i;

      	System.out.println("Factorial of " + num + " is: " + f);
	}
}