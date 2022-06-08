package calculator;
import java.util.*;
import arithmetic.Addition;
import arithmetic.Division;
import arithmetic.Multiplication;
import arithmetic.Subtraction;
public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		Addition a=new Addition();
		Subtraction s=new Subtraction();
		Multiplication m=new Multiplication();
		Division d=new Division();
		System.out.println("enter the value 1:");
		x=sc.nextInt();
		System.out.println("enter the value 2:");
		y=sc.nextInt();
		a.add(x, y);
		s.sub(x, y);
		m.mul(x, y);
		d.div(x, y);

	}

}
