import java.util.Scanner;
public class LargestOf3 {
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter first number:");
	int num1 = scanner.nextInt();
	System.out.println("Enter second number:");
	int num2 = scanner.nextInt();
	System.out.println("Enter third number:");
	int num3 = scanner.nextInt();
	System.out.println("Is the first number the largest?");
    if (num1 > num2 && num1 > num3){
        System.out.println("YES!");
	}
    else {
        System.out.println("NO!");
    }
    System.out.println("Is the second number the largest?");
	if (num2 > num3 && num2 > num1){
	System.out.println("YES!");
	}
    else{
    System.out.println("NO!");
    }
    System.out.println("Is the third number the largest?");
	if (num3 > num1 && num3 > num2){
	System.out.println("YES!");
	}
    else{
    System.out.println("NO!");
    }
	}
}
