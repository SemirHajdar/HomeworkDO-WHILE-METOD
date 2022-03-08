import java.util.Scanner;

public class Task1aaa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter Integer different from 0:");
        int total = reader.nextInt();

        isNumberPositive(total);
    }

    public static void isNumberPositive (int number1){
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Please enter integer: ");
            number1 = reader.nextInt();

        } while (number1>0);
    }
}

//Napravite petlju koja ce za svaki ukljucujuci i za pocetni broj traziti da unosite za svaki loop pozitivan broj.
//Ukoliko unesete negativan broj while petlja zavrsava.
