import java.util.Scanner;
class basics2{
    public static void main (String [] args)
    {
        int [] score ={80, 75, 90, 65, 88};
        Scanner scan = new Scanner(System.in);
        System.out.println("Change the score of 3rd subject's score");
        score [2] = scan.nextInt();
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);
        System.out.println(score.length);
    }
}