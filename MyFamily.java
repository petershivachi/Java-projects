public class MyFamily
{
    public static void main(String args[])
    {
        Family father = new Family();
        Family  mother = new Family();
        Family you = new Family();

        System.out.println("\nEnter the family name : ");
        System.out.println("\n------------------------");
        Family.getSurName();

        System.out.println("\nData entry for the father : ");
        System.out.println("\n---------------------------");
        father.input();

        System.out.println("\nData entry for the mother : ");
        System.out.println("\n---------------------------");
        mother.input();

        System.out.println("\nData entry for you : ");
        System.out.println("\n---------------------------");
        you.input();

        System.out.println("\nOutput for the father : ");
        System.out.println("\n---------------------------");
        father.output();

        System.out.println("\nOutput for the mother : ");
        System.out.println("\n---------------------------");
        mother.output();

        System.out.println("\nOutput for you : ");
        System.out.println("\n---------------------------");
        you.output();
    }
}
