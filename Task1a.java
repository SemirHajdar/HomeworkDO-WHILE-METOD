import java.util.Scanner;

public class Task1a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter first Integer: ");
        int firstNumber = reader.nextInt();
        System.out.println("Please enter second Integer: ");
        int secondNumber = reader.nextInt();

        System.out.println("Sum of Integers " + firstNumber + " and " + secondNumber + " is " + sum(firstNumber,secondNumber));
        System.out.println("Difference of Integers " + firstNumber + " and " + secondNumber + " is " + difference(firstNumber,secondNumber));
        System.out.println("Product of Integers " + firstNumber + " and " + secondNumber + " is " + product(firstNumber,secondNumber));
        System.out.println("Quotient of Integers " + firstNumber + " and " + secondNumber + " is " + quotient(firstNumber,secondNumber));

    }
    public static int sum (int number1, int number2){
        return number1 + number2;
    }
    public static int difference (int number1, int number2){
        return number1 - number2;
    }
    public static int product (int number1, int number2){
        return number1 * number2;
    }
    public static int quotient (int number1, int number2){
        return number1 / 2;
    }
}

//Napravite 4 funkcije koje int-ove: Sabiraju, Oduzimaju ,mnoze ,djele