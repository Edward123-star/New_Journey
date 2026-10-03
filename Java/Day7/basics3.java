import java.util.Scanner;
class Testcase
{
    static String projectName;

    private String name;
    private String platform;
    private boolean result;

    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    
    public void setplatform(String platform)
    {
        this.platform = platform;
    }

    public String getplatform()
    {
        return platform;
    }
     
    public void setresult(boolean result)
    {
        this.result = result;
    }

    public boolean getresult()
    {
        return result;
    }
}

class basics3{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the project Name: ");
        Testcase.projectName=scan.nextLine();

        Testcase test1 = new Testcase();
        System.out.print("Enter test name: ");
        String name = scan.nextLine();

        System.out.print("Enter platform: ");
        String platform = scan.nextLine();

        System.out.print("Enter Result(True/False): ");
        boolean result=scan.nextBoolean();

        test1.setname(name);
        test1.setplatform(platform);
        test1.setresult(result);

        System.out.println();
        System.out.println("Project: " + Testcase.projectName);
        System.out.println("Details of the " + name);
        System.out.println(test1.getname());
        System.out.println(test1.getplatform());
        System.out.println(test1.getresult());
    }
}