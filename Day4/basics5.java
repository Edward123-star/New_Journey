import java.util.Scanner;

class basics5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter the number of scores to be stored: ");
        int score = scan.nextInt();
       
        int[] scores = new int[score];

        System.out.print("Enter the 1 score: ");
        scores[0] = scan.nextInt();
        
        int lowest = scores[0];
        for(int i=1; i<score; i++)
        {
            System.out.println("Enter the " + (i+1) + " score: ");
            scores[i] = scan.nextInt();
            
            if(scores[i]<lowest)
            {
               lowest = scores[i]; 
            }
            
        }
        System.out.println("Lowest score is " + lowest);
    }
}