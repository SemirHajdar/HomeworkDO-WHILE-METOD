import java.util.Scanner;

public class Task1b {
    public static void main(String[] args) {

        int randomNumber = 0;
        exitNumberCheck(randomNumber);
    }

    public static void exitNumberCheck (int number){
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Please enter any integer: ");
            number= reader.nextInt();
        }
        while (number !=-1000);
        System.out.println("Exit number -1.000 is detected.");
    }
}

//Napravite petlju koja prima brojeve no ukoliko se posalje broj -1000 izadje iz petlje
//U konzoli neka se ispise “Please enter any integer” prije vaseg unosa broja.
//nakon sto unesete -1000 napisite poruku da je exit broj -1000 detektovan.
