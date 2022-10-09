import java.util.*;

class SecondAssignment
{
	public static Scanner in = new Scanner(System.in);
	public static String again;
	public static int choose, quantity = 1;
	public static double total = 0;
	public static double pay;

	public static void main(String[] args)
	{
		int exit = 1;
		do
		{
			menu();
		    order();
		}
		while(exit !=0);
	}
	public static void menu()
	{
		System.out.println("--------------------------------------------------");
		System.out.println("\t\t     >MENU<");
		System.out.println();
		System.out.println("\t1. Red Lobster \t\t\t 45 PHP");
		System.out.println("\t2. Pizza chicken \t\t 40 PHP");
		System.out.println("\t3. Chicken Pasta \t\t 35 PHP");
		System.out.println("\t4. Cancel");
		System.out.println("--------------------------------------------------");
	}
	public static void order()
	{
		System.out.println("(Choose a number 1-3 but 4 is to cancel)\n");
		System.out.print("Choose: ");
		choose = in.nextInt();

		if(choose == 1)
		{
			System.out.println("You choose: Red Lobster");
			System.out.print("How many Red Lobster you want to buy?: ");
			quantity = in.nextInt();
			total = quantity * 45;

			System.out.println("\nYou want to buy again?");
			System.out.print("Yes or No: ");
			again = in.next();

			if(again.equalsIgnoreCase("Yes"))
			{
				order();//calling
			}
			else
			{
				System.out.print("Enter Payment: ");
				pay = in.nextDouble();
				if(pay < total)
				{
					System.out.println("Not enough money");
				}
				else
				{
					////none
				}
				total = pay - total;
				System.out.println("The Total is: " + total);
			}
		}
		else if(choose == 2)
		{
			System.out.println("You choose: Pizza Kitchen");
			System.out.print("How many Pizza Kitchen you want to buy?: ");
			quantity = in.nextInt();
			total = quantity * 40;

			System.out.println("\nYou want to buy again?");
			System.out.print("Yes or No: ");
			again = in.next();

			if(again.equalsIgnoreCase("Yes"))
			{
				order();//calling
			}
			else
			{
				System.out.print("Enter Payment: ");
				pay = in.nextDouble();
				if(pay < total)
				{
					System.out.println("Not enough money");
				}
				else
				{
					////none
				}
				total = pay - total;
				System.out.println("The Total is: " + total);
			}
		}
		else if(choose == 3)
		{
			System.out.println("You choose: Pizza Kitchen");
			System.out.print("How many Pizza Kitchen you want to buy?: ");
			quantity = in.nextInt();
			total = quantity * 35;

			System.out.println("\nYou want to buy again?");
			System.out.print("Yes or No: ");
			again = in.next();

			if(again.equalsIgnoreCase("Yes"))
			{
				order();//calling
			}
			else
			{
				System.out.print("Enter Payment: ");
				pay = in.nextDouble();
				if(pay < total)
				{
					System.out.println("Not enough money");
				}
				else
				{
							////none
				}
				total = pay - total;
				System.out.println("The Total is: " + total);
			}
		}
		else if(choose == 4)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("\n>[Choose 1-4 only]<");
			order();
		}


	}

}
