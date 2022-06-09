import java.util.*;

class Employee{
	int eNo,Salary;
	String eName;
	
	Employee(int no, int salary,String name){
		this.eNo = no;
		this.Salary = salary;
		this.eName = name;
	}
	
	public static void main(String args[]){
	
	System.out.println("Enter the information : ");
	Scanner sc = new Scanner(System.in);
	
	
	
	

	System.out.print("Enter the num of employees: ");
	int Max = sc.nextInt();
	Employee[] emp = new Employee[Max]; 


	int num = sc.nextInt();
	int salary = sc.nextInt();
	String name = sc.nextLine();

	System.out.println( );		
}	
}