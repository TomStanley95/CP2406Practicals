package Chapter04.ProgrammingExercises;

import java.util.Scanner;

public class Billing {
    public static final double TAX = .08;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of the book/s:");
        double price = input.nextDouble();
        System.out.println("Enter the quantity of the book/s:");
        int quantity = input.nextInt();
        System.out.println("Enter the discount for the books:");
        double couponValue = input.nextDouble();
        double totalDue = computeBill(price);
        System.out.println("The price of one photo book is: $" + totalDue);
        totalDue = computeBill(price, quantity);
        System.out.println("The price of " + quantity + " books are: $" + totalDue);
        totalDue = computeBill(price, quantity, couponValue);
        System.out.println("The price of " + quantity + " books with a " + couponValue + "% discount is: $" + totalDue);
    }

    public static  double computeBill(double price){
        return price + ( TAX * price);
    }
    public static  double computeBill(double price, int quantity){
        return (price * quantity) + ( TAX * (price * quantity));
    }
    public static  double computeBill(double price, int quantity, double couponValue){
        return ((price * quantity) - ((price * quantity) * couponValue)) + ( TAX * (price * quantity));
    }
}
