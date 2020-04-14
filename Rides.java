public class Rides
{
    public static void main(String args[])
    {
        Vehicle vehicle = new Vehicle();
        Matatu mat = new Matatu();

        System.out.println("\nData entry for the Vehicle :> ");
        System.out.println("\n------------------------------");
        vehicle.v_input();

        System.out.println("\nData entry for the Matatu:> ");
        System.out.println("\n-------------------------------");
        mat.m_input();

        System.out.println("\nData Analysis for the Vehicle :>");
        System.out.println("\n---------------------------------");
        vehicle.v_output();

        System.out.println("\nData Analysis for the Matatu:>");
        System.out.println("\n---------------------------------");
        mat.m_output();
    }
}
