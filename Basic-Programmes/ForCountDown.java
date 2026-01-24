import java.util.Scanner;
public class ForCountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        for(int i=num ;i>0 ;i--){
            System.out.println("Countdown"+i);
        }
        scanner.close();
}
}