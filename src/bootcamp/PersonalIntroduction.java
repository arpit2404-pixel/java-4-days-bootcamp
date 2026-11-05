package bootcamp;

import java.util.Scanner;

public class PersonalIntroduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume the leftover newline.

        System.out.print("Enter your college name: ");
        String college = input.nextLine();

        System.out.println();
        System.out.println("My name is " + name + ". I am " + age
                + " years old. I study at " + college + ".");

        input.close();
    }
}
