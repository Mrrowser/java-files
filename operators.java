import java.util.*;

public class operators
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int num1, num2;
		double sum, sub, mul, divide;

		System.out.print("Enter First Number: ");
		num1 = in.nextInt();

		System.out.print("Enter First Number: ");
		num2 = in.nextInt();

		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		divide = num1 / num2;

		System.out.println("Sum is: " + sum);
		System.out.println("Subtract is: " + sub);
		System.out.println("Multiply is: " + mul);
		System.out.println("Divide is: " + divide);


	}
}
