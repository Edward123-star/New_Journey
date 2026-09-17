import java.util.Scanner;
class basics4{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Execute the test 10 times");
        int testcount = 1;
        while(testcount <= 10)
        {
        System.out.print("Enter the test execution status true/false: ");
        boolean status = scan.nextBoolean();
        if(status)
        {
            System.out.println("Test case passed");
            System.out.println("Test case is executed for the " + testcount + " time");
        }
        else
        {
            System.out.println("Test case failed");
            break;
        }
        testcount++;
    }
    if(testcount > 10)
    {
    System.out.println("Test Execution is completed");
    }
    else
    {
        System.out.println("Test execution failed");
    }
}
}