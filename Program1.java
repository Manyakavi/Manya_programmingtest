package in.manya.screeningtest;

import java.util.Scanner;

class MyCalci {
    double a, b;
    String operation;

    MyCalci(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    void calculate() {
        switch (operation) {
            case "+":
                System.out.println("Result: " + (a + b));
                break;
            case "-":
                System.out.println("Result: " + (a - b));
                break;
            case "*":
                System.out.println("Result: " + (a * b));
                break;
            case "/":
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String op = sc.next();

        MyCalci c = new MyCalci(a, b, op);
        c.calculate();

	}

}
