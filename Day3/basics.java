import java.util.Scanner;
class basics
{
   public static void login()
    {
        System.out.println("Username entered");
        System.out.println("Password entered");
        System.out.println("Login successful");
        
    } 
    public static void wrong()
    {
        System.out.println("Wrong username or password");
    }
   
   public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String username = "";
        String password = "";

        while(!((username .equals("Edward") && password .equals("Hari"))
             || 
            (username .equals("Hariharan") && password .equals("1234"))))
        {
        System.out.print("Enter username: ");
        username = scan.nextLine();
        System.out.print("Enter the Password: ");
        password = scan.nextLine();
            
        if(username .equals("Edward") && password .equals("Hari"))
        {
            login();
        }
        else if(username .equals("Hariharan") && password .equals("1234"))
        {
            login();
        }
        else
        {
            wrong();
        }
    }
        
    }

   
    


}