import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num = scanner.nextDouble();
        double total = 0.0;
        while(num != 0){
            total = num + total;
            System.out.println("Enter a number(0 to stop):");
            num = scanner.nextDouble();
        }
        System.out.println("Sum of digits is:"+total);
        scanner.close();
    }
}