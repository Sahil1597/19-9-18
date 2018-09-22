import java.util.*;
class Q2
{
	public static void main(String ars[])
	{
	Scanner sc = new Scanner(System.in);
	
	HashMap <Integer,String> h = new HashMap<>();	
	System.out.print("Enter size for HashMap : ");
	int n = sc.nextInt();
	
	System.out.println();
	System.out.println("Enter the ID followed by Name : ");
	for(int i=0;i<n;i++)
	{
		int num = sc.nextInt();
		String str = sc.nextLine();
		
		h.put(num,str);
	}
	System.out.println();
	System.out.println("Result is : ");
	for(Map.Entry x:h.entrySet())					//entrySet() is used to return a collection view of the mappings contained in Hashmap.
	{  
		System.out.println(x.getKey()+" "+x.getValue());  
    }  
	
	}
}