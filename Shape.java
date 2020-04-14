public class Shape
{
    public static  void main(String args[])
    {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();
        Cuboid cuboid1 = new Cuboid();
        Cuboid cuboid2 = new Cuboid();
        Cuboid cuboid3 =  new Cuboid();

        System.out.println("\nData entry for the first rectangle:> ");
        System.out.println("\n---------------------------------------");
        rectangle1.getData();
        rectangle1.compute();

        System.out.println("\nData entry for the second rectangle:> ");
        System.out.println("\n---------------------------------------");
        rectangle2.getData();
        rectangle2.compute();

        System.out.println("\nData entry for the third rectangle:> ");
        System.out.println("\n---------------------------------------");
        rectangle3.getData();
        rectangle3.compute();

        System.out.println("\nData entry for the first Cuboid:> ");
        System.out.println("\n--------------------------------------");
        cuboid1.getData();
        cuboid1.calculate();

        System.out.println("\nData entry for the second Cuboid:> ");
        System.out.println("\n--------------------------------------");
        cuboid2.getData();
        cuboid2.calculate();

        System.out.println("\nData entry for the third Cuboid:> ");
        System.out.println("\n--------------------------------------");
        cuboid3.getData();
        cuboid3.calculate();

        System.out.println("\nAnalysis for the first Triangle:>");
        System.out.println("\n------------------------------------");
        rectangle1.outputData();

        System.out.println("\nAnalysis for the second Triangle:>");
        System.out.println("\n------------------------------------");
        rectangle2.outputData();

        System.out.println("\nAnalysis for the third Triangle:>");
        System.out.println("\n------------------------------------");
        rectangle3.outputData();

        System.out.println("\nData Analysis for the first Cuboid:> ");
        System.out.println("\n---------------------------------------");
        cuboid1.outputData();

        System.out.println("\nData Analysis for the second Cuboid:> ");
        System.out.println("\n---------------------------------------");
        cuboid2.outputData();

        System.out.println("\nData Analysis for the third Cuboid:> ");
        System.out.println("\n---------------------------------------");
        cuboid3.outputData();
    }
}
