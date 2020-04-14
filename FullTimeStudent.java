import java.util.Scanner;

public class FullTimeStudent extends Student
{
    private String guardianID, guardianName, guardianTel;

    public void ftsInput()
    {
        Scanner inputTaker = new Scanner(System.in);

        s_input();
        System.out.println("\nGuardian's ID Number : ");
        guardianID = inputTaker.nextLine();
        System.out.println("\nGuardian's Name : ");
        guardianName = inputTaker.nextLine();
        System.out.println("\nGuardian's Telephone Number : ");
        guardianTel = inputTaker.nextLine();
    }

    public void ftsOutput()
    {
        s_output();
        System.out.println("\nGuardian's ID Number : "+guardianName);
        System.out.println("\nGuardian's Name : "+guardianName);
        System.out.println("\nGuardians Telephone No. : "+guardianTel);
    }

}
