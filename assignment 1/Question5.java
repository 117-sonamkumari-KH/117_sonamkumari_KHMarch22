//5.write a java program to check the given number is positive or negative.
	import java.util.Scanner;
	class Question5
	{
		public static void main(String []args)
		{
			Scanner sc = new Scanner(System.in);      
			System.out.print("enter n = ");
			int n = sc.nextInt();
			
			
			//condtion check by using else if ladder.
			if(n>0)
			{
				System.out.println("positive number");
			}
			else if(n<0)
			{
				System.out.println("negative number");
			}
			else
			{
				System.out.println("number is neither negative nor positive");
			}
		}
	}
				
			
			
	
	
	
	
  
  