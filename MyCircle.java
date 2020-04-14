public class MyCircle
{
    public static void main(String args[])
    {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();

        System.out.println("\nData entry for the first circle:> ");
        System.out.println("\n-------------------------------");
        circle1.getData();
        circle1.calculate();

        System.out.println("\nData entry for the second circle:> ");
        System.out.println("\n-------------------------------");
        circle2.getData();
        circle2.calculate();

        System.out.println("\nData entry for the third circle:> ");
        System.out.println("\n-------------------------------");
        circle3.getData();
        circle3.calculate();

        System.out.println("\nData entry for the fourth circle:> ");
        System.out.println("\n-------------------------------");
        circle4.getData();
        circle4.calculate();

        System.out.println("\nData entry for the fifth circle:> ");
        System.out.println("\n-------------------------------");
        circle5.getData();
        circle5.calculate();

        System.out.println("\nOutput for the first circle:>");
        System.out.println("\n-------------------------------");
        circle1.dataOut();

        System.out.println("\nOutput for the second circle:>");
        System.out.println("\n-------------------------------");
        circle2.dataOut();

        System.out.println("\nOutput for the third circle:>");
        System.out.println("\n-------------------------------");
        circle3.dataOut();

        System.out.println("\nOutput for the fourth circle:>");
        System.out.println("\n-------------------------------");
        circle4.dataOut();

        System.out.println("\nOutput for the fifth circle:>");
        System.out.println("\n-------------------------------");
        circle5.dataOut();
    }
}
