public class Shapes2
{
    public static void  main(String args[])
    {
        Circles circle1 = new Circles();
        Circles circle2 = new Circles();
        Circles circle3 = new Circles();

        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder();
        Cylinder cylinder3 = new Cylinder();

        System.out.println("\nData entry for the first circle : ");
        System.out.println("\n-----------------------------------");
        circle1.c_dataIn();
        circle1.c_calculate();

        System.out.println("\nData entry for the second circle : ");
        System.out.println("\n-----------------------------------");
        circle2.c_dataIn();
        circle2.c_calculate();

        System.out.println("\nData entry for the third circle : ");
        System.out.println("\n-----------------------------------");
        circle3.c_dataIn();
        circle3.c_calculate();

        System.out.println("\nData entry for the first cylinder : ");
        System.out.println("\n--------------------------------------");
        cylinder1.cy_dataIn();
        cylinder1.cy_calculate();

        System.out.println("\nData entry for the second cylinder : ");
        System.out.println("\n--------------------------------------");
        cylinder2.cy_dataIn();
        cylinder2.cy_calculate();

        System.out.println("\nData entry for the third cylinder : ");
        System.out.println("\n--------------------------------------");
        cylinder3.cy_dataIn();
        cylinder3.cy_calculate();

        System.out.println("Data Analysis for the first circle : ");
        System.out.println("\n-------------------------------------");
        circle1.c_dataOut();

        System.out.println("Data Analysis for the second  circle : ");
        System.out.println("\n-------------------------------------");
        circle2.c_dataOut();

        System.out.println("Data Analysis for the third circle : ");
        System.out.println("\n-------------------------------------");
        circle3.c_dataOut();

        System.out.println("\nData Analysis fot the first cylinder : ");
        System.out.println("\n----------------------------------------");
        cylinder1.output();

        System.out.println("\nData Analysis fot the second cylinder : ");
        System.out.println("\n----------------------------------------");
        cylinder2.output();

        System.out.println("\nData Analysis fot the third cylinder : ");
        System.out.println("\n----------------------------------------");
        cylinder3.output();
    }
}
