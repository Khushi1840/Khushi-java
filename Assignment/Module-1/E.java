package Assignment1;

import java.util.Scanner;

public class E 
{ 
  public static void main(String[] args) 
  {
	int sum=0;
	//int i=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 Numbers:");
//	int a1 = sc.nextInt();
//	int a2 = sc.nextInt();
//	int a3 = sc.nextInt();
//	int a4 = sc.nextInt();
//	int a5 = sc.nextInt();
	
	for(int i=0;i<5 ;i++ )
	{
		System.out.println("Enter no .. "+i);
		int no=sc.nextInt();
		sum=sum+no;
		
	}
	System.out.println("Sum is:"+sum);
	System.out.println("Average is:"+sum/5);
	
  }
}
