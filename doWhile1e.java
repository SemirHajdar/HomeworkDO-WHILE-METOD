import java.util.Scanner;

public class doWhile1e {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Do you want a start number ? If Yes please Enter the Integer. If No please press the Enter.");
        String initialNumber = reader.nextLine();

        do {
            if (nullNumber(initialNumber)) {
                addition(initialNumber);
                return;
            } else
            twoNumbers(Integer.parseInt(initialNumber));
        } while (true);
    }

    public static void addition(String number2) {
        Scanner reader = new Scanner(System.in);
        int newNumber;
        char operationSign;
        int temp = 0;

        System.out.println("Which operation would you like to use: *,/,+,-? ");
        operationSign = reader.next().charAt(0);
        while ((operationSign != '*') && (operationSign != '/') && (operationSign != '+') && (operationSign != '-')) {
            System.out.println(" Which operation would you like to use: *,/,+,-?");
            operationSign = reader.next().charAt(0);
        }
        System.out.println("Please enter a number: ");
        newNumber = reader.nextInt();
        if (operationSign == '+') {
            int addition = temp + newNumber;
            System.out.println("Sum of Numbers " + temp + " and " + newNumber + " is " + (temp+newNumber));
        } else if (operationSign == '-') {
            int addition = temp - newNumber;
            System.out.println("Difference of Numbers " + temp + " and " + newNumber + " is " + (temp-newNumber));
        } else if (operationSign == '*') {
            int addition = temp * newNumber;
            System.out.println("Product of Numbers " + temp + " and " + newNumber + " is " + temp*newNumber);
        } else if (operationSign == '/') {
            int addition = temp / newNumber;
            System.out.println("Quotient of Numbers " + temp + " and " + newNumber + " is " + temp/newNumber);
        }
    }

    public static void twoNumbers (int number2) {
        Scanner reader = new Scanner(System.in);
        int newNumber;
        char operationSign;

        System.out.println("Which operation would you like to use: *,/,+,-? ");
        operationSign = reader.next().charAt(0);
        while ((operationSign != '*') && (operationSign != '/') && (operationSign != '+') && (operationSign != '-')) {
            System.out.println(" Which operation would you like to use: *,/,+,-?");
            operationSign = reader.next().charAt(0);
        }
        System.out.println("Please enter a number: ");
        newNumber = reader.nextInt();
        if (operationSign == '+') {
            int addition = number2 + newNumber;
            System.out.println("Sum of Numbers " + number2 + " and " + newNumber + " is " + (number2 + newNumber));
        } else if (operationSign == '-') {
            int addition = number2 - newNumber;
            System.out.println("Difference of Numbers " + number2 + " and " + newNumber + " is " + (number2 - newNumber));
        } else if (operationSign == '*') {
            int addition = number2 * newNumber;
            System.out.println("Product of Numbers " + number2 + " and " + newNumber + " is " + number2 * newNumber);
        } else if (operationSign == '/') {
            int addition = number2 / newNumber;
            System.out.println("Quotient of Numbers " + number2 + " and " + newNumber + " is " + number2 / newNumber);
        }
    }
    public static boolean nullNumber (String number){
        return ((number == null) || (number.length() == 0));
    }
}
