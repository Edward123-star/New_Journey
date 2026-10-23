import java.util.Scanner;
class basics{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the five Scores here");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        int[] score = {a,b,c,d,e};

        int passes= 0;
        int fails = 0;
        int skipped=0;

        for(int i =0; i<score.length; i=i+1)
        {
            if(score[i] <= 0)
            {
                System.out.println("Test "+(i+1)+ ": Skip");
                skipped++;
                continue;
                
            }

            if(score[i]>=60)
            {
                System.out.println("Test "+(i+1)+ ": Pass");
                passes++;
            }
            else{
                System.out.println("Test "+(i+1)+ ": Fail");
                fails++;
            }
        }
        System.out.println("Total passed: " + passes);
        System.out.println("Total failed: " + fails);
        System.out.println("Total Skips: " + skipped);
    }
}