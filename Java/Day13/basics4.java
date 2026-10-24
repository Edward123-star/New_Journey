import java.util.Scanner;
class basics4
{
    static void checkHealth(String expected, String actual)
    {
        if (expected .equals(actual))
        {
            System.out.println("Health test result is passed");
        }
        else{
            System.out.println("Health test result failed");
        }
    }
    static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);

        String expected = "Normal";

        System.out.println("If the result is good enter Normal, if not enter the ectual reselt");
        System.out.print("Enter the Health result 1: ");
        String actual1 = scan.nextLine();

        System.out.print("Enter the Health result 2: ");
        String actual2 = scan.nextLine();

        System.out.print("Enter the Health result 3: ");
        String actual3 = scan.nextLine();

        checkHealth(expected,actual1);
        checkHealth(expected,actual2);
        checkHealth(expected,actual3);
        
    }
}