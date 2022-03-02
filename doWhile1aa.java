import java.util.Scanner;

public class doWhile1aa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter Integer: ");
        int total = reader.nextInt();

        if (total != 0 ){
            positiveCheckNumber(total);
        } else {
            System.out.println("You number is 0.");
            positiveCheckNumber(total);
        }
    }
    public static void positiveCheckNumber (int number){
        Scanner reader = new Scanner(System.in);
        do{
            System.out.println("Enter Integer greater than 0:");
            number = reader.nextInt();
        } while (number >= 0);
    }
}