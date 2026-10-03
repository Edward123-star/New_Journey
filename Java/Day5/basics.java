import java.util.Scanner;
class basics
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the game name: ");
        String name = scan.nextLine();
        System.out.println("Select game is "+ name);
        System.out.println("Number of letters in the name is " + name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    }
}