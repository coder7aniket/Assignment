package test;
import java.util.Scanner;


	public class InvalidSalary extends Exception
	
	{  
		
		public InvalidSalary()
		{
			
		}
		public InvalidSalary(String s) 
		{
			super(s);
		}
	  
	   static void check(int salary) throws InvalidSalary
	   {  
	     if(salary<30000) 
	     { 
	      throw new InvalidSalary("you are not eligible for home loan");
	     }
	     else 
	     {
	      System.out.println("you are eligible for home loan"); 
	     }
	   } 
	     
	   public static void main (String[] args)
	   {  
	      try
	      {		System.out.println("Enter your per month salary");
	    	 int salary=new Scanner(System.in).nextInt();
	    	check(salary);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+m);
	      }    
	  }  
	}  