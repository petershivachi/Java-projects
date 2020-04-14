public class Campus
{
    public static void main(String args[])
    {
        PartTimeStudent stud1 = new PartTimeStudent();
        PartTimeStudent stud2 = new PartTimeStudent();
        FullTimeStudent stud3 = new FullTimeStudent();
        FullTimeStudent stud4 = new FullTimeStudent();

        System.out.println("\nData entry for the first part time Student:>");
        System.out.println("\n---------------------------------------------");
        stud1.ptsInput();

        System.out.println("\nData entry for the second part time Student:>");
        System.out.println("\n---------------------------------------------");
        stud2.ptsInput();

        System.out.println("\nData entry for the first full time Student:>");
        System.out.println("\n---------------------------------------------");
        stud3.ftsInput();

        System.out.println("\nData entry for the second full time Student:>");
        System.out.println("\n---------------------------------------------");
        stud4.ftsInput();

        System.out.println("\nData Analysis for the first part time student:>");
        System.out.println("\n-----------------------------------------------");
        stud1.ptsOutput();

        System.out.println("\nData Analysis for the first part time student:>");
        System.out.println("\n-----------------------------------------------");
        stud2.ptsOutput();

        System.out.println("\nData Analysis for the first part time student:>");
        System.out.println("\n-----------------------------------------------");
        stud3.ftsOutput();

        System.out.println("\nData Analysis for the first part time student:>");
        System.out.println("\n-----------------------------------------------");
        stud4.ftsOutput();
    }
}
