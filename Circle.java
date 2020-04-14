import java.util.Scanner;

public class Circle
{
    private double radius, diameter, circum, area;

    public void getData()
    {
        Scanner inputTaker = new Scanner(System.in);
        System.out.println("\nEnter the radius of the circle:> ");
        radius = inputTaker.nextDouble();
    }

    public void calculate()
    {
        diameter = radius * 2;
        final double PI = 3.142;

        circum = PI * diameter;

        area = PI * radius * radius;
    }

    public void dataOut()
    {
        System.out.println("\nRadius = "+radius);
        System.out.println("\nDiameter = "+diameter);
        System.out.println("\nCircum = "+ circum);
        System.out.println("\nArea = "+area);
    }
}
