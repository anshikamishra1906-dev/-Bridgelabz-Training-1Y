import java.util.Scanner;
public class KilometerToMiles{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in kilometer:");
        double km = scanner.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given km " + km);
    }
}