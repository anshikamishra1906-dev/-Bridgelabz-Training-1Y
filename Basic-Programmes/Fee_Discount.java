import java.util.Scanner;
public class Fee_Discount{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter fee : ");
	int fee = scanner.nextInt();
	System.out.print("Enter discount percent : ");
	int discountPercent = scanner.nextInt();
	double discount = (fee*discountPercent)/ 100.0;
	double payable_fee = fee - discount;
	System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + payable_fee);
	}
}	