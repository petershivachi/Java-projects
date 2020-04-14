import java.util.Scanner;

public class Circles
{
    protected double radius, diameter, cirCum, area;

    public void c_dataIn()
    {
        Scanner inputTaker = new Scanner(System.in);
        System.out.println("\nEnter the radius of the circle : ");
        radius = inputTaker.nextDouble();
    }

    public void c_calculate()
    {
        final double PI = 3.142;
        diameter = radius * 2;

        cirCum = PI * diameter;
        area = PI * radius * radius;
    }

    public void c_dataOut()
    {
        System.out.println("\nCircumference : "+cirCum);
        System.out.println("\nArea : "+area);
    }
}
