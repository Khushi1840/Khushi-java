package Assignment1;

import java.util.Scanner;

public class C
{
     public static void main(String[] args)
     {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year:");
		int a=sc.nextInt();
		if(a%4==0)
		{
			System.out.println("Year is Leap Year!!");
		}
		else
		{
			System.out.println("Year is not Leap Year!!");
		}
		
	 }
}
