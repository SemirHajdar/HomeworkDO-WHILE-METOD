import java.util.Scanner;

public class Task1c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

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
}

//Modifikujte petlju da sabira prethodno upisan broj i novi broj i zatim ispise total
//ukoliko nikakav broj nije deklarisan kao pocetni pocinje od broja 0 :
//ie. Please enter integer:
//4
//Total of 0 and 4 is 4.



