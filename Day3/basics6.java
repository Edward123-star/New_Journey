import java.util.Scanner;
class basics6
{
    public static boolean isBuildReady(String platform, int criticalBugs, int majorBugs, boolean regressionCompleted)
    {
        if(platform .equals("PC") || platform .equals("Xbox") || platform .equals("PS5"))
        {
            if(criticalBugs == 0 && majorBugs <= 2 && regressionCompleted)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            String platform;
            int criticalBugs;
            int majorBugs;
            boolean regressionCompleted;
            System.out.print("Please enter the platform: ");
            platform = scan.nextLine();
            System.out.print("Please enter the number of critical bugs: ");
            criticalBugs = scan.nextInt();
            System.out.print("Please enter the number of major bugs: ");
            majorBugs = scan.nextInt();
            System.out.print("Please enter if regression testing is completed (true/false): ");
            regressionCompleted = scan.nextBoolean();
            boolean buildReady =isBuildReady(platform, criticalBugs, majorBugs, regressionCompleted);
            if(buildReady)
            {
                System.out.println("The build is ready for release");
            }
            else
            {
                System.out.println("The build is not ready for release");
            }
        }
    }
