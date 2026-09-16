import java.util.Scanner;
 class training1{     
    public static void main (String [] args)     
    {         
        Scanner scan = new Scanner(System.in);         
        System.out.print("Please Enter your age: ");         
        int age = scan.nextInt();         
        if (age >= 18 && age <= 60)         
            {             
                System.out.println("You're eligibal to apply");         
            }         
            else{             
                System.out.println("You are not eligible to apply");         
            }     
        } 
    }