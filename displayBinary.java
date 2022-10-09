

class displayBinary
{
	public static void binaryRep(int num)
	{
		if (num > 1)

			binaryRep(num / 2);
		 	System.out.print(num % 2);
	}
	public static void main(String []args)
	{
		displayBinary n = new displayBinary();

       	n.binaryRep(10);
       	System.out.println("\n");
        n.binaryRep(8);
        System.out.println("\n");
        n.binaryRep(5);
        System.out.println("\n");

	}

	public String binaryRep(int num)
	{
	    //write your code here
	    if (num > 1)

	    binaryRep(num / 2);
	    System.out.print(num % 2);

	    System.out.println(binaryRep(10));
	    System.out.println(binaryRep(8));
	    System.out.println(binaryRep(5));
	}

}