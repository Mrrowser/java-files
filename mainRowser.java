import java.util.*;

class mainRowser
{
	public static void main(String []args)
	{

		//calling a method.
		Login();
		ArrayNumbers();
		ODDandEVEN();
    }
    public static void Login()
    {
		Scanner scan = new Scanner(System.in);

		System.out.println("\n>> LOG-IN <<");
		System.out.print("\nEnter Username: ");
		String user = scan.next();

		System.out.print("Enter Password: ");
		String pass = scan.next();

		System.out.println("\nWelcome " + user + " your account has been log in...");
	}
    public static void ArrayNumbers()
    {
		Scanner in = new Scanner(System.in);

		System.out.print("\nEnter number of element: ");
		int value = in.nextInt();

		int arr[] = new int[value], sum = 0;
		int i;
        System.out.println();

		for(i = 0; i < value; i++)
		{
			System.out.print("Enter number element of " + i + ": ");
			arr[i] = in.nextInt();
		}
		for(i = 0; i < value; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("\nTotal is: " + sum);

	}
	public static void ODDandEVEN()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter a Number: ");
		int num = input.nextInt();

		if(num %2 == 0)
		{
			System.out.println("\n[" + num + " is Even number.]");
		}
		else
		{
			System.out.println("\n[" + num + " is Odd number.]");
		}
	}
}