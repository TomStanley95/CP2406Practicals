package Chapter03.ProgrammingExercises;

import java.util.Scanner;

import static Chapter03.ProgrammingExercises.CraftPricing.calcRetail;

public class CraftPricing {
    private final static int SHIPPING = 7;
    private final static int MATERIALMOD = 12;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String productName = input.nextLine();
        System.out.println("Enter the cost of material: ");
        int materialCost = input.nextInt();
        System.out.println("Enter the hours worked: ");
        int hoursWorked = input.nextInt();
        float retailPrice = calcRetail(materialCost, hoursWorked);
        System.out.printf("The retail price for a %s is %s",productName, retailPrice);
    }

    public static float calcRetail(int materialCost, int hoursWorked){
        float retailPrice =  ((materialCost + MATERIALMOD) * hoursWorked) + SHIPPING;
        return retailPrice;
    }

}
