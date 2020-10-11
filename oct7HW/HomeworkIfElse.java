import java.util.Scanner;

public class HomeworkIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey, how much did the Lakers score last night? ");
        int gameScore = Integer.parseInt(input.nextLine());

        if (gameScore >= 120) {
            System.out.println("You're lying. Seriously!?");
        } else if (gameScore>=110) {
            System.out.println("Whaaat, that's a great game.");
        } else if (gameScore>=100) {
        System.out.println("Yeah, as expected.");
        } else if (gameScore>=90) {
        System.out.println("Lower than expected, but still decent.");
        } else if (gameScore <90) {
    System.out.println("Wow, that was a low-scoring game.");
    }
}
}