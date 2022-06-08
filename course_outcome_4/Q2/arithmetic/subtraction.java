package arithmetic;
interface sub {
	void sub(int x,int y);
}
public class Subtraction implements sub{
	public void sub(int x,int y)
	   { 
	     System.out.println("subtraction:"+(x-y));	
	   }

   }
