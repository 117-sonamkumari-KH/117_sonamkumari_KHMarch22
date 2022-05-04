// 5.Write a java that takes two numbers as input and display the product of two numbers.

import java.util.Scanner;

class Multiplication
{
public static void main(String args[])
{
int n1,n2;
Scanner sc = new Scanner(System.in);

System.out.println("enter n1 = ");
n1 = sc.nextInt();

System.out.println("enter n2 = ");
n2 = sc.nextInt();
int result = n1 * n2;
System.out.println("The product of given two number is = " +result);
}
}