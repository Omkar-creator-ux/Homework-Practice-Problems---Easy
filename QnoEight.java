import java.util.Scanner;
public class QnoEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = input.nextInt();
         System.out.println("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid Operator");
        }
        input.close();
    }
    }