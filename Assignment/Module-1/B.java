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
	else if(ch.equals("A")||ch.equals("E")||ch.equals("I")||ch.equals("O")||ch.equals("U")||ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u"))
	 {
		System.out.println("It is an Vowel");
	
	 }
	else
	    System.out.println("It is an Consonant");
	}


}


