import java.util.Scanner;

public class Qnosix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else {
            System.out.println("The largest number is: " + num2);
        }

        input.close(); 
    }
}
