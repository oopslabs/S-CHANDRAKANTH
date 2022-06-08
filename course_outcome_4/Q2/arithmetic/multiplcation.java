package arithmetic;
interface mul {
	void mul(int x,int y);
}
public class Multiplication implements mul
   {
      public void mul(int x,int y)
         {
    	  System.out.println("multiplication:"+(x*y));
         }
   }
