import java.util.Scanner;
class basics6
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String name;
        String password;   
        do 
        {
            System.out.print("Please enter the user name: ");
            name = scan.nextLine();
            System.out.print("Please enter the password: ");
            password = scan.nextLine();
            if (!name.equals("Edward") || !password.equals("Hari@123"))
            {
            System.out.println( " Incorrect user name/ password entered. Please try again.");
            }

        }
        while(!name.equals("Edward") || !password.equals("Hari@123"));
        {
            System.out.println("Welcome professor " + name);
            
        }
        System.out.println("Login successful");
    }
}