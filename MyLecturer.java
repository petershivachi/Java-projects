public class MyLecturer
{
    public static void main(String args[])
    {
        Lecturer lect1 = new Lecturer("Fred","Omondi",7);
        Lecturer lect2 = new Lecturer("Merab","Omondi", 11);
        Lecturer lect3 = new Lecturer();

        System.out.println("\nData output for lecturer 1:> ");
        System.out.println("\n-------------------------------");
        lect1.output();

        System.out.println("\nData output for lecturer 2:> ");
        System.out.println("\n-------------------------------");
        lect2.output();

        System.out.println("\nData output for lecturer 3:> ");
        System.out.println("\n-------------------------------");
        lect3.output();

        System.out.println("\nData input for lecturer 3:> ");
        System.out.println("\n-------------------------------");
        lect3.input();

        System.out.println("\nData output for lecturer 3 [For the second time]:> ");
        System.out.println("\n-------------------------------");
        lect3.output();
    }
}
