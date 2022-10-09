import java.util.*;

class Personal
{
	public static void main(String []args)
	{

		Scanner scan = new Scanner(System.in);
		Scanner in = new Scanner(System.in);

		System.out.print("Enter Student No: ");
		int studentN0 = in.nextInt();

		System.out.print("Enter Last Name: ");
		String lname = scan.nextLine();

		System.out.print("Enter First Name: ");
		String fname = scan.nextLine();

		System.out.print("Enter Middle Name: ");
		String mname = scan.nextLine();

		System.out.print("\nEnter Course: ");
		String course = scan.nextLine();

		System.out.print("\nEnter Subject1 Name: ");
		String sub1 = scan.nextLine();
		System.out.print("Enter unit of Subject1: ");
		int unit1 = in.nextInt();


		System.out.print("\nEnter Subject2 Name: ");
		String sub2 = scan.nextLine();
		System.out.print("Enter unit of Subject2: ");
		int unit2 = in.nextInt();

		System.out.print("\nEnter Subject3 Name: ");
		String sub3 = scan.nextLine();
		System.out.print("Enter unit of Subject3: ");
		int unit3 = in.nextInt();

		System.out.print("\nEnter Subject4 Name: ");
		String sub4 = scan.nextLine();
		System.out.print("Enter unit of Subject4: ");
		int unit4 = in.nextInt();

		System.out.print("\nEnter Subject5 Name: ");
		String sub5 = scan.nextLine();
		System.out.print("Enter unit of Subject5: ");
		int unit5 = in.nextInt();

		System.out.print("\nEnter Subject6 Name: ");
		String sub6 = scan.nextLine();
		System.out.print("Enter unit of Subject6: ");
		int unit6 = in.nextInt();

		System.out.print("\nEnter Subject7 Name: ");
		String sub7 = scan.nextLine();
		System.out.print("Enter unit of Subject7: ");
		int unit7 = in.nextInt();

		System.out.print("\nEnter Subject8 Name: ");
		String sub8 = scan.nextLine();
		System.out.print("Enter unit of Subject8: ");
		int unit8 = in.nextInt();


		PersonalInfo(studentN0,lname,fname,mname);
		AcademicProfile(course,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,unit1,unit2,unit3,unit4,unit5,unit6,unit7,unit8);


	}
	public static void PersonalInfo(int studentN0, String lname, String fname, String mname)
	{

		System.out.println("----------------------------------------------------------------");
		System.out.println("Student No: " + studentN0);
		System.out.println("Last Name: " + lname);
		System.out.println("First Name: " + fname);
		System.out.println("Middle Name: " + mname);


	}
	public static void AcademicProfile(String course, String sub1, String sub2, String sub3, String sub4, String sub5, String sub6, String sub7, String sub8, int unit1, int unit2, int unit3, int unit4, int unit5, int unit6, int unit7, int unit8)
	{


		System.out.println("\nProgram:");
		System.out.println("Course: " + course + "\t\t\t\t\t\tUnits");

		System.out.println("\n1. " + sub1 + "\t\t\t\t\t\t" + unit1);
		System.out.println("2. " + sub2  + "\t\t\t\t\t\t" + unit2);
		System.out.println("3. " + sub3  + "\t\t\t\t\t\t" + unit3);
		System.out.println("4. " + sub4  + "\t\t\t\t\t\t" + unit4);
		System.out.println("5. " + sub5  + "\t\t\t\t\t\t" + unit5);
		System.out.println("6. " + sub6  + "\t\t\t\t\t\t" + unit6);
		System.out.println("7. " + sub7  + "\t\t\t\t\t\t" + unit7);
		System.out.println("8. " + sub8  + "\t\t\t\t\t\t" + unit8);
		System.out.println("\nTotal Units\t\t\t\t\t\t24");

		System.out.println("----------------------------------------------------------------");
	}

}