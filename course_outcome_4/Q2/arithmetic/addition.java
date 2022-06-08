package arithmetic;
interface add {
	void add(int x,int y);
}
public class Addition implements add
   {
      public void add(int x,int y)
         {
    	  System.out.println("addition:"+(x+y));
         }
   }
