package test;

import java.util.Scanner;

public class Matth 
{
	public static void main(String args[])
	   {
	      try
	      {
	         int n1=new Scanner(System.in).nextInt();
	         int n2=new Scanner(System.in).nextInt();;
	         int output=n1/n2;
	         System.out.println ("Output: "+output);
	      }
	      catch(ArithmeticException e)
	      {
	         System.out.println ("You Shouldn't divide a number by zero");
	      }
	   }
}
	


