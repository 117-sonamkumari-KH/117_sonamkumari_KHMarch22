//12.write a java program thats takes three numbers as a input to calculate and print the average of the numbers.

import java.util.Scanner;
class Averagesofnumber
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.print("enter n1: ");
int n1 = sc.nextInt();

System.out.print("enter n2: ");
int n2 = sc.nextInt();

System.out.print("enter n3: ");
int n3 = sc.nextInt();


	int avg = (n1+n2+n3)/3;
	System.out.println("Average of three numbers is = " +avg);
	}
	}