import java.util.Scanner;
class basic3
{
    public static void testgame(String game, String platform, double version)
{
    System.out.println("Selected game is " + game);
    System.out.println("Selected Platform is "+ platform);
    System.out.println("Build version is " + version);
}

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String game;
        System.out.print("Please enter the game name: ");
        game = scan.nextLine();
        System.out.print("Please enter the platform: ");
        String platform = scan.nextLine();
        System.out.print("Please enter the build version: ");
        double version = scan.nextDouble();
        testgame(game, platform, version);
        
    }
}