import java.util.*;

class week
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Input number: ");
		int num = in.nextInt();

		switch(num)
		{
			case 1:
				System.out.println("\nMONDAY");
				break;
			case 2:
				System.out.println("\nTUESDAY");
				break;
			case 3:
				System.out.println("\nWEDNESDAY");
				break;
			case 4:
				System.out.println("\nTHURSDAY");
				break;
			case 5:
				System.out.println("\nFRIDAY");
				break;
			case 6:
				System.out.println("\nSATURDAY");
				break;
			case 7:
				System.out.println("\nSUNDAY");
				break;
			default:
				System.out.println("\nInvalid");
				break;
		}
	}
}