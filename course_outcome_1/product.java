import java.util.*;
public class product{
	int pcode,price;
	String pname;
	void input()
	   {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the product code:");
		pcode=sc.nextInt();
		System.out.println("enter the product price:");
		price=sc.nextInt();
		sc.nextLine();
        System.out.println("enter the product name:");
		pname=sc.nextLine();
	   }
	void display()
	  {
		System.out.println(pcode);
		System.out.println(price);
		System.out.println(pname);
	  }
	public static void main(String[] args) {
		product obj1=new product();
		product obj2=new product();
		product obj3=new product();
		obj1.input();
		obj2.input();
		obj3.input();
		System.out.println("the first object:");
		obj1.display();
		System.out.println("the second object:");
		obj2.display();
		System.out.println("the three object:");
		obj3.display();
		if(obj1.price < obj2.price && obj1.price < obj3.price)   
		  {
			System.out.println("first object has lowest price:");
		  }
		else if(obj2.price < obj1.price && obj2.price < obj3.price)
		  {
			System.out.println("second object has lowest price:");
		  }
		else
	      {
			System.out.println("third object has lowest price:");

	      }
	}

}
