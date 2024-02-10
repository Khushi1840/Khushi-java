package Assignment1;

import java.util.Scanner;

public class E 
{ 
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 Numbers:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int e = sc.nextInt();
	
	int sum=a+b+c+d+e;
	float average=sum/5;
	
	System.out.println("Sum is="+sum);
	System.out.println("Average is="+average);
  }
}
