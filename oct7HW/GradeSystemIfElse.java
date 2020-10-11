import java.util.Scanner;

public class GradeSystemIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What'd you make on the exam? ");
        int testScore = Integer.parseInt(input.nextLine());

        if (testScore >= 90) {
            System.out.println("Wow, you made an A!!");
        } else if (testScore>=80) {
            System.out.println("Cool, you made a B!");
        } else if (testScore>=70) {
        System.out.println("Ok, you made a C.");
        } else if (testScore>=60) {
        System.out.println("I mean, you made a D but basically failed");
        } else if (testScore <60) {
    System.out.println("I mean, you made an F but you tried!!");
    }
}
}