class test
{
    String testName;
    String status;
    String platform;

void showTestDetails()
{
    System.out.println(testName);
    System.out.println(platform);
    System.out.println(status);
}
}
class basics
{
    public static void main (String [] args)
    {
        test test1 = new test();
        test test2 = new test();
        test1.testName = "Testcase1";
        test1.status="Pass";
        test1.platform="PC";

        test2.testName = "Testcase2";
        test2.status="Fail";
        test2.platform="PS5";

      test1.showTestDetails();
    }
}