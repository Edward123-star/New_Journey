import java.util.Scanner;
class basics2
{
    static void checkresult(int score)
    {
        if(score>=60)
        {
            System.out.println("Test PASS");
        }
        else{
            System.out.println("Test Fail");
        }
    }
    static void checkPerformance(int score)
    {
        if(score>=90)
        {
            System.out.println("Excellent");
        }
        else if(score>=60)
        {
            System.out.println("Good work");
        }
        else
        {
            System.out.println("Need improvement");
        }
    }

    public static void main(String args[])
    {
        checkresult(80);
        checkresult(45);
        checkresult(71);
        checkresult(59);

        checkPerformance(91);
        checkPerformance(85);
        checkPerformance(61);
        checkPerformance(59);

    }
    
}
