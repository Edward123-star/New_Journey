import java.util.Scanner;
class basic2
{
    public static void testBrowser(String browser)
{
    System.out.println("Selected browser is " + browser);
}

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String browser;
        System.out.print("Please enter the browser name: ");
        browser = scan.nextLine();
        testBrowser(browser);
    }
}