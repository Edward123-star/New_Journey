import java.util.Scanner;
class Test
{
    String name;
    String platform;
    boolean status;

    Test(String testname, String testPlatform, boolean testStatus)
    {
        name = testname;
        platform = testPlatform;
        status = testStatus;
    }

    void showTestDetails()
    {
        System.out.println("Test Name: " + name);
        System.out.println("Platform: " + platform);
        System.out.println("Status: " + status);
    }
}

class basics3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter test name: ");
        String testname = scan.nextLine();

        System.out.print("Enter platform: ");
        String testPlatform = scan.nextLine();

        System.out.print("Enter status: ");
        boolean testStatus=scan.nextBoolean();

        Test test1 = new Test(testname,testPlatform,testStatus);

        System.out.println();
        System.out.println("Details of the "+ testname);
        test1.showTestDetails();

        

    }
}