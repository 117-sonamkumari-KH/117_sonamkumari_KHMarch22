//15.write a program to swap two variables.


    import java.util.Scanner;
	class Question15
	{
	public static void main(String args[])
	{
	int a,b;
	Scanner input = new Scanner(System.in);
	System.out.print("enter a: ");
	a = input.nextInt();
	System.out.print("enter b: ");
	b= input.nextInt();
	
	System.out.println("Before swap");
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	
	a = a+b;
	b = a-b;
	a = a-b;
	
	System.out.println("After swap");
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	}
	}
	