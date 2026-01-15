import java.util.Scanner;
public class TotalPurchasePrice{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	System.out.print("Enter Unit Price: ");
    double unitPrice = scanner.nextDouble();
	System.out.print("Enter Quantity: ");
    int quantity = scanner.nextInt();
    double totalPrice = unitPrice * quantity;
    System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
