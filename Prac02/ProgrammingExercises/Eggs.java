package ProgrammingExercises;

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        int numberEggs;
        double cost;
        final double DOZEN = 3.25;
        final double SINGLE = 0.45;
        Scanner input = new Scanner(System.in);
        System.out.print("How many eggs would you like to buy?");
        numberEggs = input.nextInt();
//        System.out.print(numberEggs);
        int numberDozen = numberEggs/12;
//        System.out.println(numberDozen);
        int numberSingle = numberEggs % 12;
//        System.out.println(numberSingle);
        cost = (numberDozen * DOZEN) + (numberSingle * SINGLE);
//        System.out.println(cost);
//        System.out.println("You ordered " +numberEggs + " eggs. That's " + numberDozen + " dozen at $" + DOZEN +
//                " per dozen and " + numberSingle + " loose eggs at " + SINGLE + " cents each for a total of $" + cost);
        String outputString = String.format("You ordered %1$d eggs. That's %2$d dozen at %3$f per dozen and %4$d loose eggs at" +
                " %5$f cents each for a total of $%6$",numberEggs, numberDozen, DOZEN, numberSingle, SINGLE, cost);
        System.out.println(outputString);
    }
}
