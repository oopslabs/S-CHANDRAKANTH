package course_outcome1;
import java.util.*;
interface prototype
  {
	 double pi=3.14;
	 void area();
	 void perimeter();
  }
class circle implements prototype
  {
	float r;
	double area,peri;
	circle()
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius:");
		r=sc.nextFloat();
	 } 
	 public void area()
	  {
		 area=pi*r*r;
		 System.out.println("area is"+area);
	  }
	 public void perimeter()
	  {
		 peri=2*pi*r;
		 System.out.println("perimeter is"+peri);
	  }
  }
class rectangle implements prototype
{
	float l,b;
	double area,peri;
	rectangle()
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		l=sc.nextFloat();
		System.out.println("enter the breadth:");
		b=sc.nextFloat();
	 } 
	 public void area()
	  {
		 area=l*b;
		 System.out.println("area is"+area);
	  }
	 public void perimeter()
	  {
		 peri=2*(l+b);
		 System.out.println("perimeter is"+peri);
	  }
}
public class q6_co3 {

	public static void main(String[] args) {
		prototype p;
		System.out.println("RECTANGLE");
		rectangle r =new rectangle();
		p=r;
		p.area();
		p.perimeter();
		System.out.println("CIRCLE");
		circle c= new circle();
		p=c;
		p.area();
		p.perimeter();
	}
}
