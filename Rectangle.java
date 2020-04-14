import java.util.Scanner;

public class Rectangle
{
    protected double length, width, area;

    public void getData()
    {
        Scanner inputTaker = new Scanner(System.in);
        System.out.println("\nEnter the length:> ");
        length = inputTaker.nextDouble();
        System.out.println("\nEnter the width : ");
        width = inputTaker.nextDouble();
    }

    public void compute()
    {
        area = length * width;
    }

    public  void outputData()
    {
        System.out.println("\nLength : "+length);
        System.out.println("\nWidth : "+width);
        System.out.println("\nArea : "+area);
    }
}
