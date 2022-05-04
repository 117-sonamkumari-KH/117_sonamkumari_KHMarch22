//10.write a java program to find the sum of the digits of a given number.
	
	
	import java.util.Scanner;
	
	class Question10
	{
		public static void main(String args[])
		{
			int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number = ");//for taking input from the user.
		int n= sc.nextInt();
		System.out.print("sum of the digits of " +n+ " is : ");
		
		while(n>0)
		{
			
			int r = n%10;
			sum+=r;
			n = n/10;
		}
			
			System.out.print(sum+ " ");
		
		}
	}
		
			
	
	
	
	
  
  