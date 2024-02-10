package Assignment1;

import java.util.Scanner;

public class B
{
   
public static void main(String[] args)
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Character:");
	String ch = sc.next();
	if(ch.length()>=2)
	{
		System.out.println("Invalid Input");
	}
	else if(ch=="A"||ch=="E"||ch=="I"||ch=="O"||ch=="U"||ch=="a"||ch=="e"||ch=="i"||ch=="o"||ch=="u")
	 {
		System.out.println("It is an Vowel");
	
	 }
	else
	    System.out.println("It is an Consonant");
	}


}


