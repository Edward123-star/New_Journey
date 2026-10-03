import java.util.Scanner;
class basics2{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("If raining out side type true, if not type false");
        System.out.print("Is it raning outside?:  ");
        boolean rain = scan.nextBoolean();
        if (rain)
        {
            System.out.println("Take an umbarlla with you");
        
        }
        else
        {
            System.out.println("You don't need an umbaralla, so enjoy the sun");

        }
        
    }
}