//9.write a java program to print all the factors of a given number.
	
	
	import java.util.Scanner;
	
	class Question9
	{
		public static void main(String args[])
		{
			
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number = ");//for taking input from the user.
		int n= sc.nextInt();
		System.out.print("factors of " +n+ " is : ");
		
		//loop runs from 1 to n.
		
		for(int i =1;i<=n;i++)
		{
			if(n%i==0)                      //if n is divided ny i then i is the factor of n.
			{
				System.out.print( i+ " ");
			}
		}
		}
	}
				
		
			
	
	
	
	
  
  