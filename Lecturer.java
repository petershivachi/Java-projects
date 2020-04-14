import java.util.Scanner;

public class Lecturer
{
    private String first_name, last_name;
    private int years_of_experience;

    public Lecturer(String fname, String lname)
    {
        first_name = fname;
        last_name = lname;
    }

    public Lecturer(String fname, String lname,  int years)
    {
        this(fname, lname);
        years_of_experience = years;
    }

    public Lecturer()//default constructor
    {
        this("","",0);
    }

    public void input()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\nFirstName:> ");
        first_name = myScanner.nextLine();
        System.out.println("\nLastName:>  ");
        last_name = myScanner.nextLine();
        System.out.println("\nYears of Experience:> ");
        years_of_experience = myScanner.nextInt();
    }

    public void output()
    {
        System.out.println("\nFirsName : "+first_name);
        System.out.println("\nLastName : "+last_name);
        System.out.println("\nYears of experience : "+years_of_experience);
    }
}
