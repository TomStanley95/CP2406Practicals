package Chapter06.ProgrammingExercises;

public class Inbetween {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter the first number");
        int min = input.nextInt();
        System.out.println("Enter a second number");
        int max = input.nextInt();

        if (max < min) {
            int temp = max;
            max = min;
            min = temp;
        }

        for (int i = min; i < max + 1; i++) {
            System.out.println(i);
        }


    }
}
