import java.util.Scanner;

public class PartTimeStudent extends Student
{
    private String employer, date_of_employment, employment_mode;

    public  void ptsInput()
    {
        s_input();
        Scanner inputTaker = new Scanner(System.in);

        System.out.println("\nEmployer's Name : ");
        employer = inputTaker.nextLine();
        System.out.println("\nDate of employment : ");
        date_of_employment = inputTaker.nextLine();
        System.out.println("\nEmployment mode : ");
        employment_mode = inputTaker.nextLine();
    }

    public void ptsOutput()
    {
        s_output();
        System.out.println("\nEmployer : "+employer);
        System.out.println("\nDate of Employment : "+date_of_employment);
        System.out.println("\nEmployment Mode : "+employment_mode);
    }
}
