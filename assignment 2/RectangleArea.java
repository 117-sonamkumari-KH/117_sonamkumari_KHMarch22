//13.write a java program to print the area and perimeter of rectangle.

import java.util.Scanner;
class RectangleArea
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("enter length : ");
float length = sc.nextFloat();

System.out.print("enter width : ");
float width = sc.nextFloat();

float perimeter = 2*(length+width);
System.out.println("perimeter of the rectangle is = " +perimeter);


float area = length*width;
System.out.println("Area of rectangle is = "+area);
}
}