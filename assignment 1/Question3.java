//2.write a java program to find the factorial of given number by using recursion.

import java.util.Scanner;
	class Question3
  
  {
	  public static int factorial(int n) //for calling function
	  {
		  if(n==0)
			  return 1;
		  else
			  return(n*factorial(n-1));
	  }
	
		
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in); //taking input from the user
	System.out.print("enter number = ");
	int n = sc.nextInt();
	
	
	
     int fact = 1;
	 fact = factorial(n);
	 System.out.println("Factorial of " +n+ " is = " +fact);  //function declaration.
	}
  }
	
	
	 
	
	
  
  