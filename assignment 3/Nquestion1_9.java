	
	class Nquestion1_9
{
	public static void main(String args[])
	{
		
	for(int i=1;i<=5;i++)
	{
		int alphabet = 65;
		for(int j=1;j<=5-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i-1;j++)
		{
			System.out.print((char)(alphabet+j)+" ");
		}
		System.out.println();
	}
	}
}