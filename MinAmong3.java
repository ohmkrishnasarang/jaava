import java.util.*;

class MinAmong3
{
	public static void main(String args[]){
		int first, second, third;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		first = sc.nextInt();
		System.out.println("Enter the second number: ");	
		second = sc.nextInt();
		System.out.println("Enter the third number: ");
		third = sc.nextInt();
		System.out.println("The Minimum among the three numbers is: \n " + Math.min(Math.min(first, second), third));
	}
}
