import java.util.Scanner;

public class Calculator {

    String Swith(Scanner input) {
        System.out.println("Choose the following index");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: *");
        System.out.println("4: /");
        System.out.println("Enter the operation index :");
        int options = input.nextInt();

        return switch (options) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            case 4 -> "/";
            default -> "0";
        };

    }

    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner input = new Scanner(System.in);
        newClass s1 = new newClass("Gashaw", 120, 'M');
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.sex);

        System.out.println("Enter the First Number: ");
        num1 = input.nextDouble();

        System.out.println("Enter the Second Number: ");
        num2 = input.nextDouble();

        Calculation calculation = new Calculation(num1, num2);
        Calculator calculator = new Calculator();
        String operation = calculator.Swith(input);

        switch (operation) {
            case "+":
                System.out.println("Result: " + Calculation.Add(calculation.a, calculation.b));
                break;
            case "-":
                System.out.println("Result: " + Calculation.Substract(calculation.a, calculation.b));
                break;
            case "*":
                System.out.println("Result: " + Calculation.Multiple(calculation.a, calculation.b));
                break;
            case "/":
                if (calculation.b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + Calculation.Divition(calculation.a, calculation.b));
                }
                break;
            default:
                System.out.println("Invalid operation index.");
                break;
        }

    }

}

/**
 * newClass
 */
class newClass {

    String name;
    int age;
    char sex;

    newClass(String a, int b, char c) {
        name = a;
        age = b;
        sex = c;
    }
}

class Calculation {
    double a, b;

    public Calculation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    static double Add(double a, double b) {
        return a + b;
    }

    static double Substract(double a, double b) {
        return a - b;
    }

    static double Multiple(double a, double b) {
        return a * b;
    }

    static double Divition(double a, double b) {
        if (b == 0)
            return -1;
        return a / b;
    }
}
