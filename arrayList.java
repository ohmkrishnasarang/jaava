import java.util.*;

class arrayList
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number of strings: ");
		int max = sc.nextInt();

		List<String> list = new ArrayList<String>();
		System.out.println("Enter the strings: ");
		for(int i=0; i<max; i++)
			list.add(sc.next());
		list.set(1, "Jabir");

		System.out.println("Size of list = " + list.size());
		
		Iterator itr = list.iterator();
		System.out.println("Entered Strings are: ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}