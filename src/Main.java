import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int uNum;
        int number;
        boolean prime = true;

        while (true) {
            Random randomNumber = new Random();

            System.out.println("Enter your preferred option(Random/Input): ");
            String reader = keyboard.nextLine();

            if (reader.equalsIgnoreCase("random")) {
                System.out.println("Random:");

                System.out.print("Enter a Number: ");
                uNum = randomNumber.nextInt(249) + 1;

                for (number = 1; number <= uNum; number++) {

                    for (int i = 2; i < number; i++) {
                        if (number % i == 0) {
                            prime = false;
                            break;
                        } else {
                            prime = true;
                        }


                    }
                    if (number == 1) {
                        System.out.println(number + " Not a Prime Number ");
                    } else if (prime) {
                        System.out.println(number + " Prime Number ");
                    } else {
                        System.out.println(number + " Not a prime number ");
                    }
                }
            } else {
                System.out.print("Enter a Number: ");
            }
            uNum = keyboard.nextInt();


            for (number = 1; number <= uNum; number++) {

                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    } else {
                        prime = true;
                    }


                }
                if (number == 1) {
                    System.out.println(number + " Not a Prime Number ");
                } else if (prime) {
                    System.out.println(number + " Prime Number ");
                } else {
                    System.out.println(number + " Not a prime number ");
                }
            }
        }
    }
}
