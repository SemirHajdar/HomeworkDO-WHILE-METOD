import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
            while (true) {
                Scanner reader = new Scanner(System.in);
                menu();
                System.out.println('\n' + "Please enter the number of which action from Menu you want: ");
                int menuNumber = reader.nextInt();

                if (menuNumber == 1) {
                    palindromCheck();
                } else if (menuNumber == 2) {
                    toRemoveElements();
                } else if (menuNumber == 3) {
                    divisibilityOfNumber();
                } else
                    System.out.println('\n' + "You entered wrong Menu number, please try again!" + '\n');
            }
    }

    public static void palindromCheck() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please Enter your word and check is it Palindrome: ");
        String word = reader.nextLine();
        String reverseWord = "";
        char[] ArrayWord = word.toCharArray();
        System.out.print("Yor word is: ");
        for (int i = 0; i < ArrayWord.length; i++) {
            System.out.print(ArrayWord[i] + " ");
        }
        System.out.print('\n' + "Yor reverse word is: ");
        for (int j = ArrayWord.length - 1; j >= 0; j--) {
            System.out.print(ArrayWord[j] + " ");
            reverseWord = reverseWord + ArrayWord[j];
        }
        if (word.equals(reverseWord)) {
            System.out.println('\n' + "The word is a Palindrome.");
        } else
            System.out.println('\n' + "The word isn't a Palindrome.");
    }
    public static void toRemoveElements (){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the length of Array: ");
        int arraylength = reader.nextInt();
        int [] array = new int[arraylength];


        for (int i=0;i<array.length;i++){
            System.out.println("Please enter your Array element: ");
            array[i]=reader.nextInt();
        }
        System.out.println("Please enter Element you want to remove: ");
        int element = reader.nextInt();

        System.out.println("Your array is: ");
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }

        String temp = Integer.toString(element);
        String myArray = Arrays.toString(array).replaceAll(temp, "");
        System.out.println('\n'+"Your new array is: ");
        myArray = myArray.replace(" ","");
        myArray = myArray.replace(","," ");
        System.out.println(myArray);
        }

        public static void divisibilityOfNumber () {
            Scanner reader = new Scanner(System.in);
            System.out.println("Please enter the divisor number ");
            int divisionNumber = reader.nextInt();
            System.out.println("Please enter the divisor number ");
            int dividerNumber = reader.nextInt();

            if (divisionNumber%dividerNumber==0) {
                System.out.println('\n' + "Your number " + divisionNumber + " is divisible with " +dividerNumber+ ".");

            } else
                System.out.println('\n' + "Your number " + divisionNumber + " isn't divisible with " +dividerNumber + ".");
        }
        public static void  menu () {
            Scanner reader = new Scanner(System.in);
            System.out.println('\n' + "MENU: " + '\n');
            System.out.println("1.  Is string a palindrom. ");
            System.out.println("2.  Filter an Array. ");
            System.out.println("3.  Number is divisible by X. ");



        }

    }
//    Napravide funkciju koja provjereava da li je nesto palindrom,
//        Napravite Funkciju koja iz niza izbacuje brojeve koji mi specifikujemo,
//        Napravite funkciju koja provjerava da li je broj djeljiv sa brojem x.
//        Kada se pokrene aplikacija Pojavi vam se meni
//        1.	Is string a palindrom
//        2.	Filter an Array
//        3.	Number is divisible by X.
//        Ukoliko izaberete  broj 2
//        Morate unjeti prvo brojeve za niz i zatim broj koji zelite izbaciti iz niza…
