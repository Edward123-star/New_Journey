import java.util.Scanner;

class basics
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of results to store: ");
        int n = scan.nextInt();
        if (n <= 0) 
            {
                System.out.println("Please enter a positive number.");
                return;
            }

        String[] results= new String[n];
        

        for(int i = 0; i<n;i++)
        {
            boolean validInput = false;
            while (!validInput)
            {
            System.out.print("Enter result for test case "  + (i + 1) + " (PASS/FAIL/SKIP): ");
            results[i]=scan.next().toUpperCase();

            if (results[i].equals("PASS") || results[i].equals("FAIL") || results[i].equals("SKIP")) 
            {
                validInput = true;
                break;
            } 
            else 
            {
                System.out.println("Invalid input. Please enter PASS, FAIL, or SKIP.");
            } 
        }

        }

        int passcount = 0;
        int failcount = 0;
        int skipcount = 0;

        for(int i = 0; i<n; i++)
        {
            if(results[i].equals("PASS"))
            {
                passcount++;
            }
            else if(results[i].equals("FAIL"))
            {
                failcount++;
            }
            else if(results[i].equals("SKIP"))
            {
                skipcount++;
            }
        }

        System.out.println("\n===== Game Test Summary =====");
        System.out.println("Total Test Cases: " + results.length);
        System.out.println("Passed: " + passcount);
        System.out.println("Failed: " + failcount);
        System.out.println("Skipped: " + skipcount);

        if(failcount > 0)
        {
            System.out.println("Build Status: FAILED");
        }
        else
        {
            System.out.println("Build Status: PASSED");
        }
    }
}