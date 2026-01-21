import java.util.Scanner;
public class LargestOf3{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter first number:");
	int num1 = scanner.nextInt();
	System.out.println("Enter second number:");
	int num2 = scanner.nextInt();
	System.out.println("Enter third number:");
	int num3 = scanner.nextInt();
	if (num1 > num2 && num1 > num3){
	System.out.println(+num1+" is largest");
	}
	if (num2 > num3 && num2 > num1){
	System.out.println(+num2+" is largest");
	}
	else{
	System.out.println(+num3+" is largest");
	}
	}
}