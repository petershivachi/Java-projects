import java.util.Scanner;

public class Matatu extends Vehicle
{
    private String route;
    private int speed_limit, passengers;

    public void m_input()
    {
        Scanner myScanner = new Scanner(System.in);

        v_input();

        System.out.println("\nRoute : ");
        route = myScanner.nextLine();
        System.out.println("Speed Limit : ");
        speed_limit =  myScanner.nextInt();
        System.out.println("\nNumber of passengers : ");
        passengers = myScanner.nextInt();
    }

    public void m_output()
    {
        v_output();
        System.out.println("\nRoute : "+route);
        System.out.println("\nSpeed Limit : "+speed_limit);
        System.out.println("\nNumber of passengers : "+passengers);
    }
}
