import java.util.Scanner;

class BrowserTest
{
    private String browser;
    private String testName;

    // Constructor
    BrowserTest(String browser, String testName)
    {
        this.browser = browser;
        this.testName = testName;
    }

    //Getter
    public String getBrowser()
    {
        return browser;
    }

    // Setter
    public void setBrowser(String browser)
    {
        this.browser = browser;
    }

     //Getter
    public String getTestName()
    {
        return testName;
    }

    // Setter
    public void setTestName(String testName)
    {
        this.testName = testName;
    }

    //Overloading method 1
    void runTest()
    {
        System.out.print("Running" + testName + "on " + browser);
    }

    //Overloading method 2
    void runTest(String URL)
    {
        System.out.println("URL: " + URL);
    }
    void runTest(String URL, int timeout)
    {
        System.out.println("Timeout: "+ timeout + " Seconds");
    }
}

    //Child class
    class SeleniumTest extends BrowserTest
    {
        private String application;
        SeleniumTest(String browser, String testName, String application)
        {
            super(browser, testName);
            this.application = application;
        }

        //Getter
        public String getApplication()
        {
            return application;
        }

        //Setter
        public void setApplication(String application)
        {
            this.application = application;
        }

        //Method overriding
        @Override
        void runTest()
        {
            System.out.println("Running Selenium " + getTestName());
            System.out.println("Application: " + application);
            System.out.println("Browser: " + getBrowser());
        }
    }


class basics
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Test Name: ");
        String testName = scan.nextLine();

        System.out.print("Enter the Browser: ");
        String browser = scan.nextLine();

        System.out.print("Enter the  URL: ");
        String URL = scan.nextLine();

        System.out.print("Enter the Application: ");
        String application = scan.nextLine();


        System.out.print("Enter the Timeout: ");
        int timeout = scan.nextInt();
        
        
        // Child class object
        SeleniumTest test = new SeleniumTest(browser, testName, application);

        System.out.println();
         System.out.println("----- Child Object -----");
        test.runTest();
        test.runTest(URL);
        test.runTest(URL, timeout);

        BrowserTest test1 = new SeleniumTest(browser, testName, application);

        System.out.println();
        System.out.println("----- Parent Reference + Child Object -----");
        test1.runTest();
        test1.runTest(URL);
        test1.runTest(URL, timeout);
    }
}