import java.util.Scanner;
class basics3 {

    static boolean checkResult(int score) {

        if (score >= 60) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the score 1 value");
        int score1 = scan.nextInt();
        boolean result1 = checkResult(score1);

        System.out.print("Enter the score 2 value");
        int score2 = scan.nextInt();
        boolean result2 = checkResult(score2);

        System.out.print("Enter the score 3 value");
        int score3 = scan.nextInt();
        boolean result3 = checkResult(score3);

        System.out.print("Enter the score 4 value");
        int score4 = scan.nextInt();
        boolean result4 = checkResult(score4);

        System.out.println("Score: " + score1);
        System.out.println("Test 1 passed/Fail: " + result1);
        System.out.println("Score: " + score2);
        System.out.println("Test 2 passed/Fail: " + result2);
        System.out.println("Score: " + score3);
        System.out.println("Test 3 passed/Fail: " + result3);
        System.out.println("Score: " + score4);
        System.out.println("Test 4 passed/Fail: " + result4);

    
    }
}
