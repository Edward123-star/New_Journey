import java.util.Scanner;

class Test
{
    // Static variable - shared by all test objects
    static String projectName;

    // Private variables - encapsulated
    private String testName;
    private String platform;

    // Constructor
    Test(String testName, String platform)
    {
        this.testName = testName;
        this.platform = platform;
    }

    // Getter
    public String getTestName()
    {
        return testName;
    }

    // Setter
    public void setTestName(String testName)
    {
        this.testName = testName;
    }

    // Getter
    public String getPlatform()
    {
        return platform;
    }

    // Setter
    public void setPlatform(String platform)
    {
        this.platform = platform;
    }

    void executeTest()
    {
        System.out.println("Test execution started");
    }
}

class GameTest extends Test
{
    private String gameName;

    // Constructor
    GameTest(String testName, String platform, String gameName)
    {
        super(testName, platform);
        this.gameName = gameName;
    }

    // Getter
    public String getGameName()
    {
        return gameName;
    }

    // Setter
    public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }

    void launchGame()
    {
        System.out.println("Game launched successfully");
    }
}

class basics
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // User input for static variable
        System.out.print("Enter project name: ");
        Test.projectName = scan.nextLine();

        // User input
        System.out.print("Enter test name: ");
        String testName = scan.nextLine();

        System.out.print("Enter platform: ");
        String platform = scan.nextLine();

        System.out.print("Enter game name: ");
        String gameName = scan.nextLine();

        // Create child object
        GameTest test1 = new GameTest(testName, platform, gameName);

        System.out.println();

        System.out.println("Project: " + Test.projectName);
        System.out.println("Test Name: " + test1.getTestName());
        System.out.println("Platform: " + test1.getPlatform());
        System.out.println("Game: " + test1.getGameName());

        test1.executeTest();
        test1.launchGame();

        scan.close();
    }
}