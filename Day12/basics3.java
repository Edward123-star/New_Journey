import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class basics3
{
    public static void main(String args [])
    {
       Scanner scan = new Scanner(System.in);
       Map <String, String> testResult = new HashMap<>();

       System.out.print("Enter the TestCase ID: ");
       String testCase1 = scan.nextLine();
       System.out.print("Enter the Test Result: ");
       String result1 = scan.nextLine();
       System.out.println();

       System.out.print("Enter the TestCase ID: ");
       String testCase2 = scan.nextLine();
       System.out.print("Enter the Test Result: ");
       String result2 = scan.nextLine();
       System.out.println();
       
       System.out.print("Enter the TestCase ID: ");
       String testCase3 = scan.nextLine();
       System.out.print("Enter the Test Result: ");
       String result3 = scan.nextLine();
       System.out.println();

       testResult.put(testCase1,result1);
       testResult.put(testCase2,result2);
       testResult.put(testCase3,result3);

       System.out.println(testResult);
       System.out.println();
       System.out.print("Enter the enquiry Testcase ID: ");
       String TC = scan.nextLine();
       

       System.out.println("Result of Testcase "+ TC +": "+ testResult.get(TC));
       System.out.println();

       System.out.print("Enter the Testcase ID to verify it is available: ");
       String TCverify1 = scan.nextLine();
       System.out.println("Does "+ TCverify1 +"exist? " + testResult.containsKey(TCverify1));
       System.out.println();

       System.out.println("Enter the Testcase ID to verify it is available: ");
       String TCverify2 = scan.nextLine();
       System.out.println("Does "+ TCverify1 +"exist? " + testResult.containsKey(TCverify2));

       System.out.println("Enter the Testcase ID to update: ");
String updateID = scan.nextLine();

System.out.println("Enter the updated result: ");
String updatedResult = scan.nextLine();

if (testResult.containsKey(updateID)) {
    testResult.put(updateID, updatedResult);
    System.out.println("Updated test results: " + testResult);
} else {
    System.out.println("Testcase ID not found.");
}

System.out.println("Total test cases: " + testResult.size());

scan.close();
    }
    
}