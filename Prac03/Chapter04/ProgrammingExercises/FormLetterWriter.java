package Chapter04.ProgrammingExercises;

public class FormLetterWriter {
    public static void main(String[] args) {
      String lastName = "Doyle";
      String firstName = "Nancy";
      displaySalutation(lastName);
      displaySalutation(firstName, lastName);

    }
    public static void  displaySalutation(String lastName){
        System.out.println("Dear Mr. or Ms. " + lastName + "\n Thankyou for your recent order");
    }
    public static void  displaySalutation(String firstName, String lastName){
        System.out.println("Dear " + firstName + " " + lastName + "\n Thankyou for your recent order");
    }

}
