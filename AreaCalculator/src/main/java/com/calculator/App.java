package com.calculator;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
		System.out.println("***********************************");
		System.out.println("	  WELCOME TO");
		System.out.println("	AREA CALCULATOR");
		System.out.println("***********************************");
		System.out.println("Enter "
								+ "\n 1. For Circle "
								+ "\n 2. For Square "
								+ "\n 3. For Rectangle "
								+ "\n 4. For Parallelogram "
								+ "\n 5. For Trapezium "
								+ "\n 6. For Triangle "
								+ "\n 7. For Rhombus");
		System.out.println("************************************");
		System.out.print("Enter your Option : ");
		int option = sc.nextInt();
		if (option==1)
		{
			System.out.println();
			System.out.println("===> Circle <===");
			System.out.print("Enter radius : ");
			double radius = sc.nextDouble();
			System.out.println("Circle Area is : "+(3.14*radius*radius));
			System.out.println("Circle Circumference is : "+2*3.14*radius);
		}
		else if (option==2)
		{
			System.out.println();
			System.out.println("===> Square <===");
			System.out.print("Enter side : ");
			double side = sc.nextDouble();
			System.out.println("Square Area is : "+side*side);
			System.out.println("Square Perimeter is : "+4*side);
		}
		else if (option==3)
		{
			System.out.println();
			System.out.println("===> Rectangle <===");
			System.out.print("Enter length : ");
			double length = sc.nextDouble();
			System.out.print("Enter width : ");
			double width = sc.nextDouble();
			System.out.println("Rectangle Area is : "+length*width);
			System.out.println("Rectangle Perimeter is : "+2*(length+width));
		}
		else if (option==4)
		{
			System.out.println();
			System.out.println("===> Parallelogram <==="); 
			System.out.print("Enter verticle height : ");
			double vheight = sc.nextDouble();
			System.out.print("Enter base : ");
			double base = sc.nextDouble();
			System.out.println("Parallelogram Area is : "+base*vheight);
			System.out.println("Parallelogram Perimeter is : "+2*(base+vheight));
		}
		else if (option==5)
		{
			System.out.println();
			System.out.println("===> Trapezium <===");
			System.out.print("Enter side1 : ");
			double side1 = sc.nextDouble();
			System.out.print("Enter side2 : ");
			double side2 = sc.nextDouble();
			System.out.print("Enter height : ");
			double height = sc.nextDouble();
			System.out.println("Trapezium Area is : "+(0.5*(side1+side2)*height));
			System.out.print("Enter side3 : ");
			double side3 = sc.nextDouble();
			System.out.print("Enter side4 : ");
			double side4 = sc.nextDouble();
			System.out.println("Trapezium Perimeter is : "+(side1+side2+side3+side4));
		}
		else if (option==6)
		{
			System.out.println();
			System.out.println("===> Triangle <===");
			System.out.print("Enter height : ");
			double height = sc.nextDouble();
			System.out.print("Enter base : ");
			double base = sc.nextDouble();
			System.out.println("Triangle Area is : "+(0.5*(base*height)));
			System.out.print("Enter side1 : ");
			double side1 = sc.nextDouble();
			System.out.print("Enter side2 : ");
			double side2 = sc.nextDouble();
			System.out.println("Triangle Perimeter is : "+(base+side1+side2));
		}
		else if (option==7)
		{
			System.out.println();
			System.out.println("===> Rhombus <===");
			System.out.print("Enter diagonal 1 : ");
			double d1 = sc.nextDouble();
			System.out.print("Enter diagonal 2 : ");
			double d2 = sc.nextDouble();
			System.out.println("Rhombus Area is : "+d1*d2*0.5);
			System.out.print("Enter side : ");
			double side = sc.nextDouble();
			System.out.println("Rhombus Perimeter is : "+4*side);
		}
		else 
		{
			System.out.println();
			System.out.println("Invalid Option..!!");
		}
		System.out.println();
		System.out.println("Thank You..🤗");
    }
}
