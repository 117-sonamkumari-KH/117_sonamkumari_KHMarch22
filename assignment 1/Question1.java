//1.wap to check the given number is even or odd.

import java.util.Scanner;
	class Question1
  {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in); //taking input from the user
	System.out.print("enter number = ");
	int n = sc.nextInt();
	
	
	if(n%2==0) //condition for for even number
	{
	System.out.println( n+ " is a even number.");
	}
	
	
	else
	System.out.println( n+ " is odd number.");
	}
   }