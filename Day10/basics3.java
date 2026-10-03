import java.util.Scanner;
// abstract class
abstract class Test
{
private String testName;
private String clientName;
static String projectName;

// Contractor
Test(String testName, String clientName)
{
    this.testName = testName;
    this.clientName = clientName;
    
}

// getters
public String getTestName()
{
    return testName;
}

// getters
public String getClientName()
{
    return clientName;
}

// getters
public String getProjectName()
{
    return projectName;
}

//Setters
public void setTestName(String testName)
{
    this.testName = testName;
}

//Setters
public void setClientName(String clientName)
{
    this.clientName=clientName;
}

//setters
public void setProjectName(String projectName)
{
    this.projectName=projectName;

}

// ABSTRACT METHOD
abstract void executeTest();

void startTest()
{
    System.out.println("Starting the test");
    System.out.println("");
    System.out.println("Project Name:" + projectName);
}
 
// method overloading
void runTest()
{
    System.out.println("Test Name: " + testName);
}

//Method overloadint 2
void runTest(String buildVersion)
{
    System.out.println("Build version: " + buildVersion);
}

//Method overloading 3
void runTest(String buildVersion, int testCase)
{
    System.out.println("Number of Test cases: " + testCase);

}

}

//Child class
class GameTest extends Test
{
    private String gameName;
    private boolean result;

    GameTest(String testName, String clientName, String gameName, boolean result)
    {
        super(testName, clientName);
        this.gameName = gameName;
        this.result = result;
    }

    // getters
    public String getGameName()
    {
        return gameName;
    }

    //Setters
    public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }

    //Getters
    public boolean getResult()
    {
        return result;

    }

    //Setter
    public void setResult(boolean result)
    {
        this.result = result;
    }

    @Override
    void executeTest()
    {
        System.out.println("Game Name: " + gameName);
    
    if(result)
    {
        System.out.println("TestResult: Passed");
        System.out.println("");
    }
    else
    {
        System.out.println("TestResult: Failed");
        System.out.println("");
    }
    }

}

// Child class 2
class WebTest extends Test
{
    private String webPage;
    private String URL;
    private boolean webResult;

    WebTest(String testName, String clientName,String webPage,String URL, boolean webResult)
    {
        super(testName, clientName);
        this.webPage=webPage;
        this.URL = URL;
        this.webResult= webResult;
    }

     //Getters
    public String getWebPage()
    {
        return webPage;
    }

    //Setters
    public void setWebPage(String webPage)
    {
        this.webPage = webPage;
    }

    //Getters
    public String getURL()
    {
        return URL;
    }

    //Setters
    public void setURL(String URL)
    {
        this.URL = URL;
    }

     //Getters
     public boolean getWebResult()
     {
         return webResult;
     }
 
     //Setters
     public void setWebResult(boolean webResult)
     {
         this.webResult = webResult;
     }
 
     @Override 
     void executeTest()
     {
         System.out.println("Web Page:" + webPage);
     
     if(webResult)
     {
         System.out.println("TestResult: Passed");
         System.out.println("");
     }
     else
     {
         System.out.println("TestResult: Failed");
         System.out.println("");
     }
     }
}

// Main class

class basics3
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the Test Name: ");
        String testName = scan.nextLine();

        System.out.print ("Please enter the Client Name: ");
        String clientName = scan.nextLine();

        System.out.print("Please enter the Project Name: ");
        String projectName = scan.nextLine();
        Test.projectName = projectName;

        System.out.print("Please enter the Build Version: ");
        String buildVersion = scan.nextLine();

        System.out.print("Please enter the test case number: ");
        int testCase = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        System.out.print("Please enter the Game Name: ");
        String gameName = scan.nextLine();
        

        System.out.print("Please enter the Game Result (true/false): ");
        boolean result = scan.nextBoolean();
        scan.nextLine(); // Consume the newline character

        System.out.println("");

        System.out.print("Please enter the Web Page: ");
        String webPage = scan.nextLine();

        System.out.print("Please enter the URL: ");
        String URL = scan.nextLine();

        System.out.print("Please enter the Web Result (true/false): ");
        boolean webResult = scan.nextBoolean();
        scan.nextLine(); // Consume the newline character

        // Child class object

        Test test1 = new GameTest( testName, clientName, gameName, result);

        test1.startTest();
        test1.runTest();
        test1.runTest(buildVersion);
        test1.runTest(buildVersion, testCase);
        test1.executeTest();

        //Child class object 2
        Test test2 = new WebTest( testName, clientName, webPage, URL, webResult);

        test2.startTest();
        test2.runTest();
        test2.runTest(buildVersion);
        test2.runTest(buildVersion, testCase);
        test2.executeTest();
    }
    }

