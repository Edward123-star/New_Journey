import java.util.ArrayList;
import java.util.Scanner;
class basics
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> failedTests = new ArrayList<>();

        System.out.print("Enter the test result for the 1st testcase: ");
        String testCase1 = scan.nextLine();

        failedTests.add(testCase1);

        System.out.print("Enter the test result for the 2nd testcase: ");
        String testCase2 = scan.nextLine();

        failedTests.add(testCase2);

        System.out.print("Enter the test result for the 3rd testcase: ");
        String testCase3 = scan.nextLine();

        failedTests.add(testCase3);

        System.out.println("Failed Tests: " + failedTests);

        System.out.println("Number of failed testcase: "+ failedTests.size());
        

        System.out.println("2nd failed testcase: "+ failedTests.get(1));
        

        System.out.println("Audio test is failed: " + failedTests.contains("Audio missing"));
        

    }
}