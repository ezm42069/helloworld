import java.io.PrintStream;

public class IDK
{
	public static void main(String[]args)
	{
		System.out.println("Hello, World");
		System.out.println("    World");
		System.out.println("+----+");
		System.out.println("|Evan|");
		System.out.println("+----+");
		int luckynumber = 9;
		// uhuihjinoh
		String greeting = "Hello World";
		PrintStream printer = System.out;
		int x;
		System.out.println("hi");
		int a = nextPower(5);
		System.out.println(a);
		bankaccount ba = new bankaccount(3.5);
		bankaccount ba2 = new bankaccount(1000.5);
		System.out.println(ba.getBalance());
		System.out.println(ba2.getBalance());
		ba.deposit(10);
		ba2.withdraw(100);
		System.out.println(ba.getBalance());
		System.out.println(ba2.getBalance());
	}
	/**
	 
	 * @param Value
	 * @return
	 */
	public static int nextPower (int Value)
	{
		return Value * Value;
	}
}

