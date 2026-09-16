import java.util.Scanner;
class basics{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Hello Mr/Ms. " + name);
        System.out.println("Your age is " + age);
    }
}