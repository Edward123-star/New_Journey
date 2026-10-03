import java.util.Scanner;
class basics5
{
    public static boolean testResult(double mark)
    {
        if(mark >= 40)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        double mark;
        System.out.print("Please enter the mark: ");
        mark = scan.nextDouble();
        boolean result = testResult(mark);
        if (result)
        {
            System.out.println("The student has passed the exam");
        }
        else
        {
            System.out.println("The student has failed the exam");
        }
    }
}