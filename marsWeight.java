import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your weight on Earth in pounds: ");
        double earthWeight = scanner.nextDouble();


        double marsWeight = earthWeight * 0.378;


        System.out.println("Your weight on Mars is " + marsWeight + " pounds.");

        scanner.close();
    }
}