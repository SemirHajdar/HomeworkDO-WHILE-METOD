import java.util.Scanner;

public class doWhile1b {
    public static void main(String[] args) {

        int total = 0;
        do {
            System.out.println("Please enter any integer: ");
            Scanner reader = new Scanner(System.in);
            total= reader.nextInt();
        }
        while (total !=-1000);
        System.out.println("Exit number -1.000 is detected");
    }
}