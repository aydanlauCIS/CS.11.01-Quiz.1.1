import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Aydan Lau
*****************************************************************************************************
*/

public class Main {
    public static void main(String[] args) {
        // Declaring variables
        Scanner myScanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;

        // Taking input for age
        System.out.println("Enter your age:");
        age = myScanner.nextInt();

        // Taking input for first name
        System.out.println("Enter your first name:");
        myScanner.nextLine();
        firstName = myScanner.nextLine();

        // Taking input for favourite food
        System.out.println("Enter your favourite food:");
        favouriteFood = myScanner.nextLine();

        // Output data collected
        System.out.println("First name: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Favourite food: " + favouriteFood);
    }
}
