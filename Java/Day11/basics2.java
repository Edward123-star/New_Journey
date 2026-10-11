import java.util.Scanner;
public class basics2 {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    String a = scan.nextLine();
    
    try{
        int result = Integer.parseInt(a);
        System.out.println("Converted number: " + result);
    }
    catch(ArithmeticException e){
        System.out.println(e.getMessage());
        System.out.println("Can't divide by zero");
    }
    catch(NumberFormatException e)
    {
        System.out.println(e.getMessage());
        System.out.println("Invalid number");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e.getMessage());
        System.out.println("Invalid array position");
    }
    System.out.print("Program completed");
}
}