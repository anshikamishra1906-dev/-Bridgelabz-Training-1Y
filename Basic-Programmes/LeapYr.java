import java.util.Scanner;
public class LeapYr{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = scanner.nextInt();
        if(year >= 1582){
        if(year % 400 == 0 || year % 100 != 0 && year % 4 ==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
        }
        scanner.close();
    }
}