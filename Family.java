import java.util.Scanner;

public class Family
{
    private static String sur_name;
    private String first_name, last_name;
    private int year_of_birth;

    public static void getSurName()
    {
        Scanner inputTaker = new Scanner(System.in);

        System.out.println("Enter the family name : ");
        sur_name = inputTaker.nextLine();
    }

    public void input()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\nFirstName : ");
        first_name = myScanner.nextLine();
        System.out.println("\nLastName : ");
        last_name = myScanner.nextLine();
        System.out.println("\nYear of birth : ");
        year_of_birth =myScanner.nextInt();
    }

    public void output()
    {
        System.out.println("\nLastName : "+last_name);
        System.out.println("\nFirstName : "+first_name);
        System.out.println("\nSurName : "+sur_name);
        System.out.println("\nYear of Birth : "+year_of_birth);
    }
}
