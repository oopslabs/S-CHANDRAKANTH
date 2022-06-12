package mca;

import java.util.Scanner;

public class Employee {
	int eno,esalary;
	String ename;
	Employee(int no,int sal,String name)
	  {
		eno=no;
		esalary=sal;
		ename=name;
	  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,no,sala,s,flag=0;
		String nam;
		System.out.println("enter then number of employee");
		n=sc.nextInt();
		sc.nextLine();
		Employee emp[]=new Employee[n];
		for(i=0;i<n;i++)
		  {
			System.out.println("employee :"+(i+1));
			System.out.println("enter the employee name:");
			nam=sc.nextLine();
			System.out.println("enter the employee number:");
			no=sc.nextInt();
			System.out.println("enter the employee salary:");
			sala=sc.nextInt();
			sc.nextLine();
			emp[i]=new Employee(no,sala,nam);
		  }
		System.out.println("enter the employee number to search:");
		s=sc.nextInt();
		for(i=0;i<n;i++)
		  {
           if(emp[i].eno==s)
             {
        	   flag=1;
        	   System.out.println("employee number:"+emp[i].eno);
        	   System.out.println("employee salary:"+emp[i].esalary);
        	   System.out.println("employee name:"+emp[i].ename);
             }
		  }
           if(flag==0)
            {
        	   System.out.println("no such employee");
            }
             }
		  
	

}
