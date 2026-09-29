import java.util.Scanner;
class Test
{
    String name;
    String platform;
    boolean status;

    Test(String name, String platform, boolean status)
    {
        this.name = name;
        this.platform = platform;
        this.status = status;
    }

    void showTestDetails()
    {
        System.out.println("Test Name: " + name);
        System.out.println("Platform: " + platform);
        System.out.println("Status: " + status);
    }
}

class basics
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter test name: ");
        String name = scan.nextLine();

        System.out.print("Enter platform: ");
        String platform = scan.nextLine();

        System.out.print("Enter status: ");
        boolean status=scan.nextBoolean();

        Test test1 = new Test(name,platform,status);

        System.out.println();
        System.out.println("Details of the "+ name);
        test1.showTestDetails();

        

    }
}