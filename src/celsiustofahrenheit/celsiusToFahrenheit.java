package celsiustofahrenheit;

import java.util.Scanner;

public class celsiusToFahrenheit {
    public  static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public  static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9)* (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Celsius To Fahrenheit");
            System.out.println("2. Fahrenheit To Celsius");
            System.out.println("0. Exit");
            System.out.println("Enter yor choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Farenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
}
