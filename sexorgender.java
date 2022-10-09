import java.util.*;

class sexorgender
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		String gender;

		System.out.print("Enter sex or gender of person: ");
		gender = scan.next();

		switch(gender)
		{
			case "m":
			  System.out.println("\n" + gender + " is Male");
			  break;

			case "f":
			  System.out.println("\n" + gender + " is Female");
			  break;

			default:
			  System.out.println("\nUnknown");
			  break;
		}
	}
}