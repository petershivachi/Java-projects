import java.util.Scanner;

public class Vehicle
{
    protected String model, country_of_manufacture;
    protected int year_of_manufacture;

    public void v_input()
    {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("\nEnter the car model : ");
        model = myScanner.nextLine();
        System.out.println("\nEnter the country of manufacture : ");
        country_of_manufacture = myScanner.nextLine();
        System.out.println("\nEnter the year of manufacture : ");
        year_of_manufacture = myScanner.nextInt();
    }

    public void v_output()
    {
        System.out.println("Car model : "+model);
        System.out.println("\nCountry of manufacture : "+country_of_manufacture);
        System.out.println("\nYear of manufacture : "+year_of_manufacture);
    }
}
