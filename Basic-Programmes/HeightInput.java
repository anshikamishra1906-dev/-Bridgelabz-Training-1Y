import java.util.Scanner;
public class HeightInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height :");
		int height_cm = scanner.nextInt();
		double total_inches = height_cm / 2.54;
		double height_feet = total_inches / 12;
		double height_inches = total_inches % 12;
		System.out.println("Your Height in cm is " + height_cm + " while in feet is " + height_feet + " and inches is " + height_inches);
		}
	}	