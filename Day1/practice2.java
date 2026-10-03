import java.util.Scanner; 
class practice2{ 
    public static void main (String [] args) 
    { 
        Scanner scan = new Scanner(System.in); 
        System.out.print("Please Enter your attendance: "); 
        int att = scan.nextInt(); 
        System.out.print("Please enter your mark: "); 
        int mark = scan.nextInt(); 
        if (att >= 75 && mark >= 45) { 
            System.out.println("You're eligible for exam"); 
        } else{ 
            System.out.println("You are not eligible for exam"); 
        } 
    } 
}