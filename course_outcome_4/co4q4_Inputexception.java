package co4q4;
import java.util.*;
class Inputexception extends Exception
   {
     public Inputexception(String msg)
        {
    	 super(msg); 
        }
   }
public class Co4q4 {

	public static void main(String[] args) {
		int n,num,sum=0,i;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		   {
			try
			  {
				System.out.println("Enter the numbers:");
				num=sc.nextInt();
				 if(num<0)
				    {
					 i--;
					 throw new Inputexception("only positive");
				    }
				 sum=sum+num;
			  }
			catch (Inputexception a)
			    {
				  System.out.println("Exception caught:"+a.getMessage());
			    }
		   }
 avg=sum/n;
System.out.println("Average:"+avg);
	}

}
