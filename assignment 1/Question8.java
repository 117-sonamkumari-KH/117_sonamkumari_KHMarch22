//8.write a java program to print the digits of number.
	
	
	import java.util.Scanner;
	
	class Question8
	{
		public static void main(String args[])
		{
			int m =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number = ");//for taking input from the user.
		int num = sc.nextInt();
		int rem1,rem2,rem3,temp;
		
		if(num>=100 && num<=999)
		{
			temp=num;
			rem1=num%10;
			num=num/10;
			
			rem2=num%10;
			num=num/10;
			
			rem3=num%10;
			num=num/10;
			
			System.out.println(rem3+ " "+rem2+ " " +rem1);
			
		}

			}
	}
			
			
	
	
	
	
  
  