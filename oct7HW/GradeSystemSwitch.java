import java.util.Scanner;

public class GradeSystemSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What'd you make on the exam? ");
        int testScore = Integer.parseInt(input.nextLine());
        switch (testScore) {
            case 100: case 99: case 98: case 97: case 96: case 95: case 94:case 93: case 92: case 91: case 90:
            System.out.println("Wow, you made an A!");
                break;
            case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:          
            System.out.println("Cool, you made a B!");
                break;
            case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
            System.out.println("Ok, you made a C.");
            break;
            case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
            System.out.println("I mean, you made a D but basically failed");
            break;
            default:
            System.out.println("I mean, you made an F but you tried!!");
            break;
        }
    }
}