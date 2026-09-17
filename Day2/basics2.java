import java.util.Random;
import java.util.Scanner;
class basics2{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Please enter the starting number: ");
        int a = scan.nextInt();
        System.out.print(" Plaese enter the maximu number of random you want: ");
        int b = scan.nextInt();
        int c = rand.nextInt(b);
        int i = a;
        while(c != i)
        {
            System.out.println("The random number is: " + c);
            c = rand.nextInt(b);
          
        }
     System.out.println("Target number is reached: " + c);

    }
}