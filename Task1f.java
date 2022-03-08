import java.util.Scanner;

public class Task1f {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char operator;
        int total = 0;
        int number2;
        do {
            System.out.println("Please enter which Math Operation you want to use (+, -, *, /): ");
            operator = reader.next().charAt(0);
            if ((operator != '+') && (operator != '-') && (operator != '*') && (operator != '/') && (operator !='=')) {
                System.out.println("You didn't choose Math operator, please try again (+, -, *, /): ");
                operator = reader.next().charAt(0);
            }
            if (operator == '=') {
                break;
            }
            else {System.out.println("Please enter Next Integer: ");
                    number2 = reader.nextInt();
                    if (operator == '+') {
                        total = sum(total, number2);
                    } else if (operator == '-') {
                        total = subtraction(total, number2);
                    } else if (operator == '*') {
                        total = multiplication(total, number2);
                    } else if (operator == '/') {
                        total = division(total, number2);
                    }
                }
        }while (operator != '=') ;
        System.out.println("Total is: " + total);
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
}
//
//    Modifikujte petlju da mozete artimeticke operacije da radite u nedogled sve dok ne upisete “=” i zatim enter
//        kada ce se ispisati samo total
//        ie    Which operation would you like to use: *,/,+,-,=?
//        +
//        Please enter integer:
//        5
//        Which operation would you like to use: *,/,+,-,=?
//        -
//        Please enter integer:
//        3
//        Which operation would you like to use: *,/,+,-,=?
//        *
//        please enter integer
//        5
//        Which operation would you like to use: *,/,+,-,=?
//        =
//        Calculator Result is 10;
