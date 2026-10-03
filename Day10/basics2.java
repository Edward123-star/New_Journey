import java.util.Scanner;
abstract class Test
{
    String clientName;
    Test(String clientName)
    {
        this.clientName= clientName;
    }
    abstract void executeTest();

    void startTest()
    {
        System.out.println("Starting test for client: " + clientName);
    }
}

class GameTest extends Test
{
    private String gameName;
    private boolean result;

    public GameTest(String clientName, String gameTest, boolean result)
    {
        super(clientName);
        this.gameName = gameTest;
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

    //Getter
    public boolean getResult()
    {
        return result;

    }
    //Setter
    public void setResult(boolean result)
    {
        this.result=result;
    }
    @Override 
    void executeTest()
    {
        System.out.println("Executing test for client: " + clientName);
        System.out.println("Executing test for game: " + gameName);
        if(result)
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
    }

}
class WebTest extends Test
{
    private String webPage;
    private String URL;
    private boolean webResult;
    public WebTest(String clientName, String webPage,String URL, boolean webResult)
    {
        super(clientName);
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
        this.webPage=webPage;
    }
   
    //Getters
    public String getURL()
    {
        return URL;
    }

    //Setters
    public void setURL(String URL)
    {
        this.URL=URL;
    }

    //Getters
    public boolean getWebResult()
    {
        return webResult;
    }

    //Setters
    public void setWebResult(boolean webResult)
    {
        this.webResult=webResult;
    }

    @Override void executeTest()
    {
        System.out.println("Executing test for client: " + clientName);
        System.out.println("Executing test for URL: " + URL);
        if(webResult)
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
    }
}

class basics2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the Client Name: ");
        String clientName = scan.nextLine();
        System.out.print("Please enter the Game Name: ");
        String gameName = scan.nextLine();

        System.out.print("Please enter the Game test result(True/False): ");
        boolean result= scan.nextBoolean();
        scan.nextLine();


        // Child class object
        Test gameTest = new GameTest(clientName, gameName, result);
        System.out.println();
        System.out.println("----- Child Object -----");
        gameTest.executeTest();

        System.out.print("Please enter the Web Page: ");
        String webPage = scan.nextLine();

        System.out.print("Please enter the URL: ");
        String URL= scan.nextLine();

        System.out.print("Please enter the Web testing result: ");
        boolean webResult= scan.nextBoolean();

        // Child class object
        Test webTest = new WebTest(clientName, webPage, URL, webResult);
        System.out.println();
        System.out.println("----- Child Object -----");
        webTest.executeTest();
    }
}
