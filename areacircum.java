import java.util.*;


public class areacircum
{
	public static void main (String[] args)
    {
		Scanner input = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);

		String again;
 		int exit = 1;
		float radius;
        double area, circum;

        do
        {
			System.out.print("\nEnter Radius : ");
			radius = input.nextFloat();

			// pi*r*r
			area = 3.14 * radius * radius; //pi r2
			circum = 3.14 * 2 * radius; // 2 pi r
			System.out.println("Area of circle is: " + area);
       		System.out.println("Circumference of circle is: " + circum);

       		System.out.print("\nTry Again (Y/N): ");
       		again = scan.next();

       		if(again.equalsIgnoreCase("Y"))
       		{
				//System.out.println("\nOkay I'll repeat...");
			}
			else if(again.equalsIgnoreCase("N"))
			{
				System.exit(0);
			}
			else
			  System.out.println("Invalid......");




		}
		while(exit!=0);
    }

}