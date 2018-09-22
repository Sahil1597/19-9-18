import java.util.*;
class Number
{
	private int value;
	
	Number()
	{
	value = -9999;	
	}
	
	Number(int value)
	{
	this.value = value;	
	}
	
	 void setValue(int value)
	{
	this.value = value;	
	}
	
	 int getValue()
	{
	return value;	
	}
	
	public boolean equals(Object t)
	{
		Number s = (Number)t;
		
		if(this.value == s.getValue())
		{
			return true;
		}
		
		else
		{
		return false;	
		}
	}
	
	public int hashCode()
	{
		return (10*value)+1;
	}
}

public class Q1
{
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	
	Set<Number> s1 = new HashSet<>();
	Set<Number> s2 = new HashSet<>();
	
	System.out.print("Enter the  size of set I : ");
	int n1 = sc.nextInt();
	
	System.out.print("Enter the  elements of set I : ");
		for(int i=1;i<=n1;i++)
		{
		int num1 = sc.nextInt();	
		s1.add(new Number(num1));	
		}
		
	
	System.out.print("Elements of set I : ");
	for(Number e:s1)
	System.out.print(e.getValue()+" ");
	
	System.out.println();
	System.out.println();
	
	System.out.print("Enter the  size of set II : ");
	int n2 = sc.nextInt();
	
	System.out.print("Enter the  elements of set II : ");
		for(int i=1;i<=n2;i++)
		{
		int num2 = sc.nextInt();	
		s2.add(new Number(num2));	
		}
		
		System.out.print("Elements of set II : ");
		for(Number f:s2)
		System.out.print(f.getValue()+" ");

		System.out.println();
		System.out.println();
	
		s1.retainAll(s2);	
		s2.retainAll(s1);


		System.out.print("\nSet I : ");
		for(Number num1 : s1)
			System.out.print( num1.getValue() + " ");
		System.out.println("\n");
		
		System.out.print("\nSet II : ");
		for(Number num2 : s2)
			System.out.print( num2.getValue() + " ");
		System.out.println("\n");
	
	sc.close();
	}
}



