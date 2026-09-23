import java.util.Scanner;
class basics4
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter test case message: ");
        String message = scan.nextLine();

        String aMessage = message.trim();
        if(aMessage.toLowerCase().contains("test passed"))
        {
            System.out.println("Test case passed");
        }
        else{
             System.out.println("Test case failed");
        }
        System.out.println(aMessage);
}
}