import java.util.Scanner;
import java.util.Random;
public class PNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        while (true) {
            Random randomNumber = new Random();
            System.out.println("This program will print out prime numbers based on option selected.");
            System.out.println("Enter your preferred option (Random or Input): ");
            String reader = keyboard.nextLine();

            if (reader.equalsIgnoreCase("random")) {
                System.out.println("Random:");

                int uNum = randomNumber.nextInt(249) +1;

                for (int i=2; i< uNum; i++) {
                    int prime = (uNum % i);

                    if (prime == 0) {
                        System.out.println(uNum + " Not a Prime Number");
                        break;
                    } else if (i == (uNum -1)&& i !=2) {
                        System.out.println(uNum + " Prime Number");
                        break;
                    }

                }
            } else {
                System.out.println("Number: ");
                int uNum = keyboard.nextInt();
                keyboard.nextLine();

                for (int i = 2; i < uNum; i++) {
                    int prime = (uNum % i);

                    if (prime == 0) {
                        System.out.println(uNum + " Not a Prime Number");
                        break;
                    } else if (i == (uNum -1) && i !=2) {
                        System.out.println(uNum + " Prime Number");
                        break;
                    }
                }
            }
        }
    }
}
