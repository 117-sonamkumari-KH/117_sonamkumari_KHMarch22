//2.write a java program to find the factorial of given number.

import java.util.Scanner;
	class Question2
  {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in); //taking input from the user
	System.out.print("enter number = ");
	int n = sc.nextInt();
	
	int fact = 1;
	
	for(int i =1;i<=n;i++) 
	{
     fact*=i;	
	}
  
     System.out.print("Factorial of "+n+" is = " +fact);
	}
  }
  
  