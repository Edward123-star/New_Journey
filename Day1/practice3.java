import java.util.Scanner; 
class practice3{ 
    public static void main (String [] args) 
    { 
        Scanner scan = new Scanner(System.in); 
        System.out.print("Please Enter the account status: "); 
        boolean accountBlocked = scan.nextBoolean(); 
        if (!accountBlocked) 
            { 
                System.out.println("You can login"); 
            } 
            else{ 
                System.out.println("You can't login"); 
            } 
        } 
    }