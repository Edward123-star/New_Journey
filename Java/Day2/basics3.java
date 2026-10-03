import java.util.Scanner;
class basics3{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the user name: ");
        String name = scan.nextLine();
        System.out.print("Please enter the password: ");
        String password = scan.nextLine();
        while(!name.equals("Edward") || !password.equals("Hari@123"))
        {
            System.out.println("Incorrect user name or password. Please try again.");
            System.out.print("Please enter the User name: ");
            name = scan.nextLine();
            System.out.print("Please enter the password: ");
            password = scan.nextLine();
        }
        System.out.println("Welcome professor " + name);
    }
}