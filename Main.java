import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please fill in a number");
        int entryNumber = scanner.nextInt();

        if (entryNumber % 5 == 0 && entryNumber % 3 == 0) {
            System.out.println("FizzBuzz");
        }
           else if(entryNumber % 5 == 0) {
               System.out.println("Fizz");
           } else if (entryNumber % 3 == 0 ) {
            System.out.println("Buzz");
        } else
               System.out.println(entryNumber);

    }
}
