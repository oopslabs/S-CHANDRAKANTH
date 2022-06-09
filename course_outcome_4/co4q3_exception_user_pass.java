package co4q3;
import java.util.*;
class Usernameexception extends Exception 
    {
	  public Usernameexception(String msg)
	     {
		  super(msg);
	     }
    }
class Passwordexception extends Exception
   {
	 public  Passwordexception(String msg)
	    {
		 super(msg);
	    }
   }
public class Checklogin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String username,password;
		System.out.println("enter the username:");
		username=sc.nextLine();
		System.out.println("enter the password:");
		password=sc.nextLine();
		int length=username.length();
		try 
		 {
		   if(length<6)
		      {
			   throw new Usernameexception("usernmae must be greater than 6 characters!");
			  }
		   else if(!password.equals("hello"))
		      {
			   throw new Passwordexception("Incorrect password \n type the correct password!");
			  }
		   else 
		      {
			   System.out.println("Login successfull!");
		      }
		   }
		catch(Usernameexception u)
		    {
			  System.out.println("Exception occured"+u.getMessage());
		    }
		catch(Passwordexception p)
		    {
			 System.out.println("Exception occured"+p.getMessage());
		    }
	}

}
