//11.write a java program to find the smallest of three numbers (a,b,c).
	
	import java.util.Scanner;
	
	class Question11
	{
		public static void main(String args[])
		{
			
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a = ");                                             //for taking input from the user.
		int a = sc.nextInt();
		System.out.print("enter b = ");                                             
		int b = sc.nextInt();
		System.out.print("enter c = ");                                          
		int c = sc.nextInt();
		
		
		//using if else ladder to check the conditon and logical AND.
		
		if(a<b && a<c)
		{
			System.out.println( a+ " is smallest.");
		}
		else if (b<c && b<a)
		{
			System.out.println( b+ " is smallest.");
		}
		else
		{
			System.out.println( c+ " is the smallest.");
		}
		}
	}
		
		
	
	
	
  
  