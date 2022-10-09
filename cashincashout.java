import java.util.*;

class cashincashout
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Scanner in = new Scanner(System.in);

		String code, again;
		int choose = 1, cash, money1, money2, cashOut, cashIn;
		int balance = 7000;

		//do
		//{
			System.out.println("\n----Cash in / Cash out on Gcash----");

			System.out.print("\nEnter your MPIN CODE: ");
			code = scan.next();
        do
		{
			switch(code)
			{
				case "0613":
					System.out.println("\n1: CASH OUT/WITHDRAW");
					System.out.println("2: CASH IN/DEPOSIT");
					System.out.print("\nChoose [1] to CASH OUT / WITHDRAW or [2] to CASH IN / DEPOSIT: ");
					cash = in.nextInt();

					switch(cash)
					{
						case 1:
							System.out.print("Enter amount to cash out: ");
							money1 = in.nextInt();


							if(money1 > 7000)
							{
								System.out.println("\n-->SORRY INSUFICIENT BALANCE");
								System.exit(0);
							}
							else if(money1 <= 7000)
							{
								cashOut = balance - money1;
								System.out.println("\n-->Your cuurent balance now is: " + cashOut);
								System.out.println("-->Thank you for transacting with us...");
							}
							else
							{
								System.out.println("\n-->Your input is Invalid");
								System.exit(0);
							}
							break;
						case 2:
							System.out.print("Enter amount to Deposit: ");
							money2 = in.nextInt();

							cashIn = balance + money2;
							System.out.println("\n-->Your current balance now is: " + cashIn);
							System.out.println("-->Thank you for transacting with us...");
							break;
						default:
							System.out.println("\n-->Your input is Invalid");
							System.exit(0);
							break;
					}
				  break;

				default:
				    System.out.println("\n-->Your MPIN Code is Incorrect");
					System.exit(0);
				  break;
			}

			System.out.println("\nDo you want to try again?");
			System.out.print("Yes or No: ");
			again = scan.next();

			if(again.equalsIgnoreCase("Yes"))
			{
				System.out.println("\n-->The Program will repeat...");
			}
			else if(again.equalsIgnoreCase("No"))
			{
				System.exit(0);
			}
			else
			{
				System.exit(0);
			}

		}
		while(choose!=0);
	}

}