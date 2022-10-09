import java.util.*;

class BMI
{
    public static void main(String[] args)
    {
		Scanner in = new Scanner (System.in);
		Scanner sc = new Scanner (System.in);
		double BMR;
		int i, num;

		System.out.print("\nEnter number to end your loop: ");
		num = sc.nextInt();

		for(i = 0; i < num; i++)
		{
			System.out.print("\nWeight: ");
			double w = sc.nextInt();

			System.out.print("Height: ");
			double h = sc.nextInt();

			System.out.print("Age: ");
			double a = sc.nextInt();

			BMR = 66.47 + (13.75*w)+ (5.003*h)-(6.755*a);

			if (BMR < 1600)
			{
				System.out.println(BMR + " Your Calories is Too low ");
			}
			else if (BMR  >= 1600 && BMR <= 2000)
			{
			    System.out.println(BMR + " Your Calories is Moderate");
			}
			else
			{
			    System.out.println(BMR + " Your Calories is Too High");
			}

			System.out.println("\nYou want to ask and input again?");
			System.out.print("Yes or No: ");
			String again = in.next();

			if(again.equalsIgnoreCase("Yes"))
			{
				System.out.println("\nContinue....");
			}
			else
			{
				System.exit(0);
			}
		}
    }
}