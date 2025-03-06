import java.util.Scanner;
public class Main {
   public static String findGrade(int score) {
      // switch-case
      switch(score/10) {
        // for >= 90
        case 10:
        case 9:
           return "A";
        // for >= 80 and <90
        case 8:
           return "B";
        // for >= 70 and <80
        case 7:
           return "C";
        // for >= 60 and <70
        case 6:
           return "D";
        // for >= 50 and <60
        case 5:
           return "E";
        // for < 50
        default:
           return "F";
      }
   }
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter score value: ");
      int score = scan.nextInt();
      System.out.println("Grade = " + findGrade(score));
      scan.close();
   }
}
