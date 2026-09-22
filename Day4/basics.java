import java.util.Scanner;
class basics{
    public static void main (String [] args)
    {
        int [] score = new int [5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the all subject marks for the total");
        System.out.print("Subject 1: ");
        score[0]= scan.nextInt();
        System.out.print("Subject 2: ");
        score[1]= scan.nextInt();
        System.out.print("Subject 3: ");
        score[2]= scan.nextInt();
        System.out.print("Subject 4: ");
        score[3]= scan.nextInt();
        System.out.print("Subject 5: ");
        score[4]= scan.nextInt();
        int total = score[0]+score[1]+score[2]+score[3]+score[4];
        System.out.print("Total mark: " + total );

    }
}