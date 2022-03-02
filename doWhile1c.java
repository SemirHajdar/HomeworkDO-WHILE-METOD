import java.util.Scanner;

public class doWhile1c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Do you want a start number ? If Yes please Enter the Integer. If No please press the Enter.");

        String initialNumber = reader.nextLine();
        int newNumber;

        do {
            if ((initialNumber == null) || (initialNumber.length() == 0)) {
                System.out.println("Please enter a number: ");
                newNumber = reader.nextInt();
                System.out.println("Sum of number 0 and " + newNumber + " is " + addition(newNumber));
                return;
            } else
                System.out.println("Please enter a number: ");
            newNumber = reader.nextInt();
            System.out.println("Sum of number " + initialNumber + " and " + newNumber + " is " + addition(initialNumber, newNumber));
        } while (addition(initialNumber,newNumber)>0);

    }
    public static int addition (int number2) {
        int addition = number2;
        return addition;
    }
    public static int addition (String number1, int number2) {
        int addition = Integer.parseInt(number1) + number2;
        return addition;
    }
}