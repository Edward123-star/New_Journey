import java.util.Scanner;
class Testcase
{
    static String projectName;

    String name;
    String platform;
    boolean result;

    Testcase(String name, String platform, boolean result)
    {
        this.name=name;
        this.platform=platform;
        this.result=result;

    }
     void showTestDetails()
    {
        System.out.println("Test Name: " + name);
        System.out.println("Platform: " + platform);
        System.out.println("Status: " + result);
    }

}
class basics2{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Project Name: ");
        Testcase. projectName= scan.nextLine();

        System.out.print("Enter test name: ");
        String name = scan.nextLine();

        System.out.print("Enter platform: ");
        String platform = scan.nextLine();

        System.out.print("Enter Result(True/False): ");
        boolean result=scan.nextBoolean();

        Testcase test1 = new Testcase(name,platform,result);

        System.out.println();
        System.out.println("Project: " + Testcase.projectName);
        System.out.println("Details of the "+ name);
        test1.showTestDetails();
    }
}