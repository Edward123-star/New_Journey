import java.util.Scanner;
class basics5{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("10 bugs can able to report per account per day");
        System.out.println("You can report the Critical and Major bugs, no need to report minor bugs");
        System.out.print("Please enter the bug severity: ");
        String severity = scan.nextLine();
        int totalbugcount = 10;
        int bugcount = 0;
        while(bugcount < totalbugcount)
        {
            
            if(severity .equals("Minor"))
            {
               
                System.out.println("Minor bug reported");
                System.out.println("this minor bug is skipped");
                System.out.print("Please enter the bug severity: ");
                severity = scan.nextLine();
                continue;
            }
            else
            {
                
                System.out.println("Bug reported");
            }
            bugcount++;
            System.out.print("Please enter the bug severity: ");
            severity = scan.nextLine();

        }
        System.out.println("Maximum bug count is reached");
        System.out.println("You reported " + bugcount + " bugs");

        
    }
}