package bootcamp;

import java.util.Scanner;

public class EligibilityChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to register for the event.");
        } else {
            System.out.println("You are not eligible to register for the event.");
        }

        input.close();
    }
}
