// Topic: Inheritation 
import java.util.Scanner;
class Test{
    // Ststic Variable
    static String projectName;

    //Private Variable - Encapsulated(To make the variable private)
    private String testName;
    private String platform;
    private boolean result;

    //Constructor
    Test(String testName, String platform, boolean result)
    {
        this.testName= testName;
        this.platform=platform;
        this.result=result;
    }

    // Getters - Toget the private variable(Encapsulated)
    public String getTestName()
    {
        return testName;
    }

    //Setters - To set the value in the private variable (Encapsulated)
    public void setTestName(String testName)
    {
        this.testName=testName;
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

    // Getter
    public boolean getResult()
    {
        return result;
    }

    // Setter
    public void setResult(boolean result)
    {
        this.result = result;
    }

    void executeTest()
    {
       if(result)
       {
        System.out.println("Test Passed"); 
        System.out.println("Test execution started"); 
       }
      

}

}

// Inheritation - Child class
class GameTest extends Test
{
    private String gameName;

    //Constructor
    GameTest(String testName, String platform, boolean result, String gameName)
    {
        super (testName, platform, result);
        this.gameName= gameName;
    }

    public String getGameName()
    {
        return gameName;
    }

    public void setGameName(String gameName)
    {
        this.gameName= gameName;
    }
     void launchGame()
    {
        if(getResult())
        {
        System.out.println("Test Passed");
        System.out.println("Game launched successfully");
        }
        else{
            System.out.println("Test Failed");
        }
    }
}
class basics2
{
    public static void main (String [] args)
    {
        // User Input for the project name
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Project Name: ");
        Test. projectName = scan.nextLine();

        // User input
        System.out.print("Enter test name: ");
        String testName = scan.nextLine();

        System.out.print("Enter platform: ");
        String platform = scan.nextLine();

        System.out.print("Enter the result True/False: ");
        boolean result = scan.nextBoolean();
        
        // If we want to get the different input from the user after the different data type, we need to use the empty input line
        scan.nextLine();

        System.out.print("Enter game name: ");
        String gameName = scan.nextLine();

        // Create the child object
        GameTest test1 = new GameTest(testName, platform, result, gameName);

        System.out.println();

        System.out.println("Project: " + Test.projectName);
        System.out.println("Test Name: " + test1.getTestName());
        System.out.println("Platform: " + test1.getPlatform());
        System.out.println("Test Result: "+ test1.getResult());
        System.out.println("Game: " + test1.getGameName());

        test1.executeTest();
        test1.launchGame();

    }
}
