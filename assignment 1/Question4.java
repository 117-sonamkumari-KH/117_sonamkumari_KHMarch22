//4.write a java program to swap two numbers without using two variable approach.

	import java.util.Scanner;
	class Question4
	{
		public static void main(String []args)
		{
			Scanner sc = new Scanner(System.in);      
			System.out.print("enter n1 = ");
			int n1 = sc.nextInt();
			System.out.print("enter n2 = ");
			int n2 = sc.nextInt();
			
			
			
			System.out.println("Before swapping");
			System.out.println("n1 = " +n1);
			System.out.println("n2 = " +n2);
			
			n1 = n1+n2;
			n2 = n1-n2;
			n1 = n1-n2;
			
			System.out.println("After swapping");
			System.out.println("n1 = " +n1);
			System.out.println("n2 = " +n2);
		}
	}
			
			
			
	
	
	
	
  
  