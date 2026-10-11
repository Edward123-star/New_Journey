import java.util.Scanner;
class Basics3
{
    public static void main(String args [])
    {
        int [] testResult = {100,  90, 80, 70, 60};

        // Step 1: Select a test case
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a test case number (1 to5): ");
        int testCase = scan.nextInt();

        int selectedScore = 0;
        boolean valid= false;

        try{
            selectedScore = testResult[testCase - 1];
            System.out.println("Selected score: " + selectedScore);

            valid = true;
        }
        catch(ArrayIndexOutOfBoundsException error)
        {
            System.out.println(error.getMessage());
            System.out.println("Invalid test case number");
        }
        //Step 2: Divide the selected score

       
        if(valid)
        {
             System.out.print("Enter a divisor: ");
        int divisor = scan.nextInt();
            try{
                int result = selectedScore / divisor;
                System.out.println("Calculated Score: " + result);
            }
            catch(ArithmeticException error)
            {
                System.out.println(error.getMessage());
                System.out.println("Cannot divide by zero");
            }
        }

        // Step 3: Convert text into an integer
         scan.nextLine(); // Consume the leftover newline

        System.out.print("Enter another score as text: ");
        String scoreText = scan.nextLine();

        try{
            int score = Integer.parseInt (scoreText);  
            System.out.println("Selected score: " + score);
        }

        catch(NumberFormatException error)
        {
            System.out.println(error.getMessage());
             System.out.println("Invalid score format");
        }
         System.out.println("Program completed");
    }
}