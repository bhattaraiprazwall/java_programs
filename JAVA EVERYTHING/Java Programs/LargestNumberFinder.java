import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();

        System.out.println("Enter the fourth number:");
        int number4 = scanner.nextInt();

        int largestNumber = number1;

        if (number2 > largestNumber) {
            largestNumber = number2;
        }

        if (number3 > largestNumber) {
            largestNumber = number3;
        }

        if (number4 > largestNumber) {
            largestNumber = number4;
        }

        System.out.println("The largest number is: " + largestNumber);
    }
}
