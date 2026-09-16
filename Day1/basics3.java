import java.util.Scanner;
class basics3{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print(" Enter the mark: ");
        int mark = scan.nextInt();
        if(mark >= 90)
        {
            System.out.println("You got A Grade");
            System.out.println(" You are Pass");
        }
        else if (mark >= 80)
        {
            System.out.println("You got B Grade");
            System.out.println("You are Pass");
        }
        else if (mark >= 70)
        {
             System.out.println("You got C Grade");
            System.out.println("You are Pass");
        }
        else if (mark >= 60)
        {
            System.out.println("You got D Grade");
            System.out.println("You are Pass");
        }
        else
        {
            System.out.println("You got F Grade");
            System.out.println("You are Fail");
        }
    }
}