//7. Write a java program that takes a number as input and print its multiplication table upto 10.

import java.util.Scanner;
class Table
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("enter number = ");
int num =sc.nextInt();

for(int i = 1; i<=10 ; i++)
{
System.out.println(num+"*"+i+"="+num*i);
}
}
}