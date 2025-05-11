//Write a Java program that checks if a number (taken as input) is even or odd using an if-else statement
public class Qnothree {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    } 
}