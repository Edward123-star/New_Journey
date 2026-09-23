import java.util.Scanner;
class basics2
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the error message: ");
        String message = scan.nextLine();
        if(message.contains("error"))
        {
            System.out.println("Error message is detected");
        }
        else{
            System.out.print("No error message detected");
        }
    }
}