import java.util.Scanner;
class Test
{
    boolean status;

    void executeTest()
    {
        if(status)
        {
            System.out.println("Test passed successfully");
        }
        else{
            System.out.println("Test failed - Bug needs investigation");
        }
    }
}
class basics2
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Test test1 = new Test();

        System.out.println("IF the test result is pass type true, if failed type false ");
        System.out.print("Enter the test status: ");
        test1.status = scan.nextBoolean();
        test1.executeTest();
    }
}