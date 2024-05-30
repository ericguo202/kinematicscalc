import java.util.*;
public class BeforeAPExam{
  // generates a random number between 0 and 9
  public static void genMessage() {
    int x = (int)(Math.random() * 10);
    message(x);
  }
  // gives the user tips about the AP exam
  public static void message(int x){
    if (x == 0){
      System.out.println("\nStudy your FRQs!");
    }
    else if (x == 1){
      System.out.println("\nTip: You got this! A 4 is NOT BAD");
      System.out.println("If you think it is then you should study more");
    }
    else if (x == 2){
      System.out.println("\nTip: Did you know that 10% of all students get a 5? Are you part of the top 10% of your class? If so, keep up the good work! If not, you should study more.");
    }
    else if (x == 3) {
      System.out.println("\nTip: If you need extra help, ask your teacher during office hours.");
    }
    else if (x == 4) {
      System.out.println("\nTip: Don't wait until the last minute to study.");
    }
    else if (x == 5) {
      System.out.println("\nTip: Pay attention in class so you don't miss valuable material.");
    }
    else if (x == 6) {
      System.out.println("\nTip: Take GOOD NOTES in class.");
    }
    else if (x == 7) {
      System.out.println("\nTip: Read your textbook!!!");
    }
    else if (x == 8) {
      System.out.println("\nTip: Get good sleep and eat well before exam day.");
    }
    else if (x == 9) {
      System.out.println("\nTip: AP Classroom has free practice problems.");
    }
    // catch-all else statement
    else {
      System.out.println("Good luck!");
    }
  }
}
