import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int [] firstArray = new int[50];
        int [] secondArray = new int[50];
        char answer;

        toFillArray(firstArray);

        int stopAssistant = toFindTheLastElementOfArray(firstArray);
        toPrintArray(firstArray,stopAssistant);

        System.out.println('\n' + "Do you want to expand your Array? Y-yes or N-no. ");
        answer=reader.next().charAt(0);

        if (answer =='y') {
            toFillArray(secondArray);
            int stopAssistantSecond = toFindTheLastElementOfArray(secondArray);
            toPrintArray(firstArray,stopAssistant);
            mergeArray(secondArray,stopAssistantSecond);
        } else
            System.exit(0);
    }

    public static void toFillArray(int [] array) {
        Scanner object = new Scanner(System.in);
        int number;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number of the array: ");
            array[i] = number = object.nextInt();
            if (number == -10) {
                break;
            }
        }
    }
    public static int toFindTheLastElementOfArray(int [] array){ // ovo sam koristio da kazem da ispisem niz elemenata koji su uneseni prije -10
        for (int i=0;i<array.length;i++){
            if (array[i]==-10)
                return i;
        }
        return -1;
    }
    public static void toPrintArray(int [] array, int index){
        System.out.println("Your array is : ");
        for (int i=0; i<index; i++){
            System.out.print(array[i]+ " ");
        }
    }
    public static void mergeArray(int [] array, int index) {
        for (int i=0;i<index;i++){
            System.out.print(array[i] + " ");
        }
    }
}

//Napravite petlju u koju unosite brojeve kada petlja detektuje broj -10,ispise vam se niz brojeva koje ste unjeli.
//Zatim ce vam se na ekranu pojaviti pitanje da li zelite da prosirite array sa opcijama y/n.
//Ukoliko upisete y, ponovno unosite brojeve koji cete dodavati na niz kada ponovno unesete -10 ispisu vam se svi brojevi koje ste unjeli.

