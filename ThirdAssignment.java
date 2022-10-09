import java.util.*;
import java.util.Arrays;

class ThirdAssignment
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		int i;
		String[] names = new String[10];
		int[] age = new int[10];
		String[] gender = new String[10];
		String[] status = new String[10];



		for(i = 0; i < 10; i++)
		{
			System.out.print("Enter name: ");
			names[i] = scan.nextLine();

		}

		for(i = 0; i < 10; i++)
		{
			System.out.print("Enter gender: ");
			gender[i] = in.nextLine();

		}

	    for(i = 0; i < 10; i++)
		{
			System.out.print("Enter age: ");
			age[i] = in.nextInt();

		}
		for(i = 0; i < 10; i++)
		{
			System.out.print("Enter Status: ");
			status[i] = scan.nextLine();

		}
		Arrays.sort(names);
		Arrays.sort(age);
		System.out.println("Name: \t       Gender: \t\t       Age: \t        Status:");
		for(i = 0; i < 10; i++)
		{
	        System.out.println(" " + names[i] + "\t\t" + gender[i] + "\t\t\t" + age[i] + "\t\t" + status[i]);
		}


	}
}