import java.util.Scanner;
public class Division{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
	System.out.print("Enter Dividend:");
    int number1 = scanner.nextInt();
	System.out.print("Enter Divisor:");
    int number2 = scanner.nextInt();
    int quotient = number1 / number2;
    int remainder = number1 % number2;
    System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 +" and " + number2);
    }
}
