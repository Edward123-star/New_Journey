import java.util.Scanner;
class basics3{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the total number subject: ");
        int size = scan.nextInt();
        int [] mark = new int [size];
        int i = 0;
        int total = 0;
        for(i=0; i<size; i++)
        {
         System.out.print("Enter the mark of subject " + (i + 1) +": "  );
         mark[i] = scan.nextInt(); 
         total = total + mark[i];
        }
        System.out.println(" Total mark is " + total);
        System.out.println("Total subjects is " + mark.length);
    }
}