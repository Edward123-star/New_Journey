import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

class basics2
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner (System.in);
        Set<String> bugId = new HashSet<>();

        System.out.print("Enter the BugId: ");
        String bugID1 = scan.nextLine();

        bugId.add(bugID1);

        System.out.print("Enter the BugId: ");
        String bugID2 = scan.nextLine();

        bugId.add(bugID2);

        System.out.print("Enter the BugId: ");
        String bugID3 = scan.nextLine();

        bugId.add(bugID3);

        System.out.print("Enter the BugId: ");
        String bugID4 = scan.nextLine();

        bugId.add(bugID4);

        System.out.println("Enter the Bug Id to be verfit: ");
         String verifyId1 = scan.nextLine();

         System.out.println("Enter the Bug Id to be verfit: ");
         String verifyId2 = scan.nextLine();

        System.out.println("Total unique bug stored: "+ bugId.size());
        System.out.println("BugIds: "+ bugId);

         
         System.out.println(bugId.contains(verifyId1));

         
         
         System.out.println(bugId.contains(verifyId2));

        
    }
}