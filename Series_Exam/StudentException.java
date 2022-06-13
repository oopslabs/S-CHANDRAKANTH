package seriesexam;
import java.util.*;
class Percentageexception extends Exception
  { 
    Percentageexception(String msg)
       {
    	super(msg);
       }
	
  }
public class Students {

	public static void main(String[] args) {
		int n,a,b,c;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  student:");
		n=sc.nextInt();
		System.out.println("enter the first subject marks:");
		a=sc.nextInt();
		System.out.println("enter the second subject marks:");
		b=sc.nextInt();
		System.out.println("enter the thrid subject marks:");
		c=sc.nextInt();
		avg=(a+b+c)/3;
		double per=(avg/100)*100;
	    try 
	     {
	    	if(per<40)
	    	  {
	    		throw new Percentageexception("failed");
	    	  }
	    	else 
	    	  {
	    		System.out.println("passed by percentage:"+per);
	    	  }
	     }
	    	catch(Percentageexception p)
	    	  {
	    		System.out.println(p.getMessage());
	    	  }
	} 
	}


