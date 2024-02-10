package Assignment1;

import java.util.Scanner;

public class A 
{
   public static void main(String[] args) 
   {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter A:");
	  int a =sc.nextInt();
	  System.out.println("Enter B:");
	  int b =sc.nextInt();
	  System.out.println("Enter C:");
	  int c =sc.nextInt();
	  if(a>b && a>c)
	  {
		  System.out.println("A is Greatest..");
	  }
	  if(b>a && b>c)
	  {
		  System.out.println("B is Greatest..");
	  }
	  else
	  {
		  System.out.println("C is Greatest..");
	  }
	   
   }
}
