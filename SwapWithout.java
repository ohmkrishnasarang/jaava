import java.util.*;

class Swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter the first number: ");
		a = sc.nextInt();
		System.out.print("Enter the second number: ");
		b = sc.nextInt();
		System.out.println("a = " + a + " b = " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping");
		System.out.println("a = " + a + " b = " + b);
		
	}
}