import java.util.Scanner;
class basics3
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        String username;
        String password;
       
        do
        {
        System.out.print("Enter User Name: ");
        username = scan.nextLine();
        System.out.print("Enter Password: ");
        password = scan.nextLine();
        if(!username.equalsIgnoreCase("Edward") || !password.equals("Hari@123"))
        {
            System.out.println("Incorrect Username/password try again" );
        }
        }
          while(!username.equalsIgnoreCase("Edward") || !password.equals("Hari@123"));
          {
            System.out.println("Welcome "+ username);
        }
    System.out.println("Login Successful");
}
}