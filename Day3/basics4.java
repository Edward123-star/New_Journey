import java.util.Scanner;
class basics4
{
    public static int calculateTotal(int price1, int price2, int price3)
    {
        int total = price1 + price2 + price3;
        return total;
    }
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int price1, price2, price3;
        System.out.print("Please enter the price of item 1: ");
        price1 = scan.nextInt();
        System.out.print("Please enter the price of the item 2: ");
        price2 = scan.nextInt();
        System.out.print("Please enter the price of the item 3: ");
        price3 = scan.nextInt();
        int total = calculateTotal(price1, price2, price3);
        System.out.println("The total price of the items is: " + total);
    }
}