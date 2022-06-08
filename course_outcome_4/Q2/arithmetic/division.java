package arithmetic;
interface div {
	void div(int x,int y);
}
public class Division implements div{
	public void div(int x,int y)
	   { 
	     System.out.println("Division:"+(x/y));	
	   }

   }
