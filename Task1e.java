import java.util.Scanner;

public class Task1e {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char operator;
        System.out.println("Please enter which Math Operation you want to use (+, -, *, /): ");
        operator = reader.next().charAt(0);

        while ((operator != '+') && (operator !='-') && (operator != '*') && (operator !='/')) {
            System.out.println("You didn't choose Math operator, please try again (+, -, *, /): ");
            operator = reader.next().charAt(0);
        }

        int number1 = startNumberCheck(0);
        System.out.println("Please enter the Second Integer: ");
        int number2 = reader.nextInt();
        if (operator == '+') {
            System.out.println("Sum of " + number1 + " and " + number2 + " is " + sum(number1, number2));
        } else if (operator == '-'){
            System.out.println("Difference of " + number1 + " and " + number2 + " is " + subtraction(number1, number2));
        } else if (operator == '*') {
            System.out.println("Product of " + number1 + " and " + number2 + " is " + multiplication(number1, number2));
        } else if (operator == '/') {
            System.out.println("Quotient of " + number1 + " and " + number2 + " is " + division(number1, number2));
        }

    }
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
    public static int subtraction (int number1, int number2){
        return number1 - number2;
    }
    public static int multiplication (int number1, int number2) {
        return number1 * number2;
    }
    public static int division (int number1, int number2) {
        return number1 / number2;
    }

    public static int startNumberCheck(int firstNumber) {
        Scanner reader = new Scanner(System.in);
        char answer;
        System.out.println("Do you want a Start Integer? Enter Y-yes or N-no: ");
        answer = reader.next().toUpperCase().charAt(0);
        if (answer == 'Y') {
            System.out.println("Please enter the Start Integer: ");
            firstNumber = reader.nextInt();
        } else if (answer == 'N') {
            firstNumber = 0;
        } else
            System.out.println("You entered wrong char.");
        return firstNumber;
    }
}
