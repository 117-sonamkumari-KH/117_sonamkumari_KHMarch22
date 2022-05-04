//6.write a java program to check the given year is Leap year or common year.
	
	
	
	import java.util.Scanner;
	class Question6
	{
		public static void main(String []args)
		{
			Scanner sc = new Scanner(System.in);      
			System.out.print("enter year = ");
			int n = sc.nextInt();
			
			//condition by ladder if else.
			
			   if(n % 400==0)
			   {
			      System.out.println(n+ " is a leap year.");
			 
			   }
				else if(n % 100==0)
				{
					System.out.println(n+ " is a common year.");
				}
				else if(n % 4==0)
				{
					System.out.println(n+ " is a leap year.");
				}
				else
				{
					System.out.println(n+ " is a common year.");
				}
		}
	}
				
			
			
			
			
			
	
	
	
	
  
  