import java.util.Scanner;

public class Cylinder extends Circles
{
    private double height, curved_surface_area, surface_area, volume;

    public void cy_dataIn()
    {
        c_dataIn();

        Scanner inputTaker = new Scanner(System.in);
        System.out.println("\nEnter the height of the cylinder : ");
        height = inputTaker.nextDouble();
    }

    public void cy_calculate()
    {
        c_calculate();

        final double PI = 3.142;

        curved_surface_area = diameter * height;
        surface_area = (area * 2) + curved_surface_area;
        volume = PI * radius * radius * height;
    }

    public void output()
    {
        System.out.println("\nCurved Surface Area : "+curved_surface_area);
        System.out.println("\nSurface Area : "+surface_area);
        System.out.println("\nVolume : "+volume);
    }
}
