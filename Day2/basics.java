// Get input from the user and print the odd numbers
import java.util.Scanner;
class basics{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Please enter the starting number: ");
        int a = scan.nextInt();
        System.out.print ("Please enter the ending number: ");
        int b = scan.nextInt();
        int oddcount = 0;
        for (int i = a; i <= b; i++)
        {
            if(i % 2 == 0)
            {

            }
            else
            {
                System.out.println(" The odd number is: " + i);
                oddcount++;
            }
        }
        System.out.println("The total number of odd numbers is: " + oddcount);
    }
}