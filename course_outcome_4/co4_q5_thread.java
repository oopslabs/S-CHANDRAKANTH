package mca;
import java.util.*;
public class Co4q5 {

	public static void main(String[] args) {
		Mul m=new Mul();
		Prime p=new Prime();
		m.start();
		p.start();

	}

}
class Mul extends Thread
  {
	public synchronized void run()
	   {
		System.out.println("Multiplication:");
		for(int i=1;i<=10;i++)
		  {
			System.out.println(i*5);
		  }
	   }
  }
class Prime extends Thread
   {
	int n;
	Scanner sc=new Scanner(System.in);
	public Prime()
	  {
		System.out.println("enter the n prime numbers");
		n=sc.nextInt();
	  }
	public synchronized void run()
	  {
		int p=0;
		for(int i=2;i<n;i++){
			p=0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					p=1;
				}
			}
			if(p==0){
				System.out.println(i+" is prime");
			}
	  }
	  }
   }
   

