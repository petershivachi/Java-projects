import java.util.Scanner;

public class Student
{
    protected String reg_no, student_name, school_or_faculty, course;
    protected int no_of_units;

    public void s_input()
    {
        Scanner inputTaker = new Scanner(System.in);

        System.out.println("\nStudent's Registration Number : ");
        reg_no = inputTaker.nextLine();
        System.out.println("\nStudent's Name : ");
        student_name = inputTaker.nextLine();
        System.out.println("\nSchool or Faculty : ");
        school_or_faculty = inputTaker.nextLine();
        System.out.println("\nCourse : ");
        course = inputTaker.nextLine();
        System.out.println("\nNo of units Taken : ");
        no_of_units = inputTaker.nextInt();
    }

    public void s_output()
    {
        System.out.println("\nStudents's Registration Number : "+reg_no);
        System.out.println("\nStudents Name : "+student_name);
        System.out.println("\nSchool or Faculty : "+school_or_faculty);
        System.out.println("\nCourse : "+course);
        System.out.println("\nNo of units taken : "+no_of_units);
    }
}
