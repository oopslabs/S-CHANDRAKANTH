package course_outcome1;
import java.util.*;

interface sports
  {
     void sportmark();	
  }
 class student
  {
	int acscore;
	student()
	  {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the acedamic score");
	    acscore=sc.nextInt();
	  }
  }
 class result extends student implements sports
   {
	int result,spmark; 
	result()
	 {
		super();
	 }
	public void sportmark()
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sports score");
		spmark=sc.nextInt(); 
	 }
	void display()
      {
		 System.out.println("academic mark is "+acscore);
		 System.out.println("Sports mark is "+spmark);
		 System.out.println("Total mark is "+(spmark+acscore));
	  }
   }
public class q5_co3 {

	public static void main(String[] args) {
		sports sp;
		result r=new result();
		sp=r;
		sp.sportmark();
		r.display();
		
	}

}
