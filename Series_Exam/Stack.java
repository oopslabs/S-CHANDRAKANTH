package exam;
import java.util.ArrayList;
import java.util.Scanner;

class stack<GE>
{
	ArrayList<GE> array;
	int size,top=-1;
	stack(int size)
	{
		this.size=size;
		array=new ArrayList<GE>(size);
	}
	void push(GE element)
	{
		if(top+1==size)
		{
			System.out.println("stack overflow");
		}
		else
		{
			top++;
			array.add(element);
		}
	}
	void pop()
	{
		System.out.println("the element popped is "+array.get(top));
		array.remove(top);
		top--;
		
	}
	void top()
	{
		System.out.println("top value is "+array.get(top));
	}
	void dis()
	{
		System.out.println("The elements are");
		for(GE object:array)
		{
			
			System.out.println(object);
		}
	}
}
public class Stack  {
public static void main(String args[])
{
	int n,num;
	System.out.println("enter the size");
	Scanner ar=new Scanner(System.in);
	n=ar.nextInt();
	stack<Integer> s=new stack<Integer>(n);
	System.out.println("enter the elements");
	for(int i=0;i<n;i++)
	{	
		num=ar.nextInt();
		s.push(num);
	}
	s.dis();
	s.pop();
	s.top();
	s.dis();
}
}
