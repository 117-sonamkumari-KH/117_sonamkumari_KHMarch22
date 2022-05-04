//6.Write a java program to print the sum(addition),multiply,subtract,divide and remainder of two numbers.
import java.util.Scanner;
class Multipleoperation
{
public static void main(String args[])
{
int n1 ,n2;

Scanner sc = new Scanner(System.in);

System.out.print("enter n1 = ");
 n1 =sc.nextInt();

System.out.print("enter n2 = ");
 n2 = sc.nextInt();

int add = n1 + n2;
System.out.println("Sum of the two number is = "+add);

int sub = n1 - n2;
System.out.println("Difference of two number is = "+sub);

int product = n1* n2;
System.out.println("product of two number is = "+product);

int div = n1/n2;
System.out.println("division of two number is = "+div);

int rem = n1%n2;
System.out.println("remainder is = " +rem);
}
}



