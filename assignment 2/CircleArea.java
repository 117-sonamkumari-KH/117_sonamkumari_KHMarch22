//11.write a java program to print the area and perimeter of a circle.

	class CircleArea
	{
	public static void main(String args[])
	{
	double radius = 7.5;
	double pi = 3.1415;
	double perimeter = 2.0*pi*radius;
	System.out.println("perimeter of the given circle is = "+perimeter);
	
	double area = pi*radius*radius;
	System.out.println("Area of the given circle is = "+area);
	}
	}