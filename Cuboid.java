import java.util.Scanner;

public class Cuboid extends Rectangle
{
   private double height, volume;

   public void get_Data()
   {
       //getData();
       Scanner myScanner = new Scanner(System.in);

       getData();

       System.out.println("\nEnter the height:> ");
       height = myScanner.nextDouble();
   }

   public void calculate()
   {
       compute();
       volume = area * height;
   }

   public void output_Data()
   {
       //outputData();
      /* System.out.println("\nLength : "+length);
       System.out.println("\nWidth : "+width);
       System.out.println("\nHeight : "+height);
       System.out.println("\nVolume : "+volume);*/
      System.out.println("\nThe volume of the cube is:> ");
   }
}
