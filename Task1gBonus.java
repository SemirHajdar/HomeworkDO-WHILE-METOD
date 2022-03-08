import java.util.Scanner;

public class Task1gBonus {
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

//    Modifikujte petlju tako da
//    Ukoliko niste deklarisali prvi broj tj pocetni. Apliakcija vas pita za vrijednost prvog broja,
//        u protivnom trazi da unesete integer:
//        Ie.
//        Please enter the starting integer:
//        5
//        Which operation would you like to use: *,/,+,-,=?
//        +
//        Please enter integer:
//        5
//        Which operation would you like to use: *,/,+,-,=?
//        -
//        Please enter integer:
//        3
//        Which operation would you like to use: *,/,+,-,=?
//        etc etc etc.    medjutim ukoliko ja deklarisem 0 kao prvi intedjer necu da me pita “Please enter the starting integer:” u narednom loop-u.

