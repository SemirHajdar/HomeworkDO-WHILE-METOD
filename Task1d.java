import java.util.Scanner;

public class Task1d {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        operatorCheck(' ');

        int number1 = startNumberCheck(0);
        System.out.println("Please enter the Second Integer: ");
        int number2 = reader.nextInt();
        System.out.println("Total of " + number1 + " and " + number2 + " is " + sum(number1, number2));
    }
    public static int sum(int number1, int number2) {
        return number1 + number2;
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
    public static void operatorCheck (char operator){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter which Math Operation you want to use (+, -, *, /): ");
        operator = reader.next().charAt(0);
        while ((operator != '+') && (operator !='-') && (operator != '*') && (operator !='/')) {
            System.out.println("You didn't choose Math operator, please try again (+, -, *, /): ");
            operator=reader.next().charAt(0);
        }
    }
}

//Modifikujte petlju da  trazi znak za artimeticku operaciju prije broja.
//ie. Which operation would you like to use: *,/,+,-?
//+
//Please enter integer:
//5
//Total of 0 and 5 is 5;
