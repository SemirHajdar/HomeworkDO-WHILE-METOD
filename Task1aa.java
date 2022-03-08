import java.util.Scanner;

public class Task1aa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter Integer different from 0:");
        int total = reader.nextInt();

        if (total!=0){
        isNumberPositive(total);

        } else
        System.out.println("You entered wrong Integer.");
        isNumberPositive(total);
    }

    public static void isNumberPositive (int number1){
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Please enter integer: ");
            number1 = reader.nextByte();

        } while (number1>0);
    }
}

//Napravite petlju koja ukoliko ima predefiniran neki broj u varijabli  “total”  koja je deklarisana prije while-a i koji je razlicit od nula
//While petlja ce traziti da unosite za svaki loop pozitivan broj.
//Ukoliko unesete negativan broj while petlja zavrsava.
