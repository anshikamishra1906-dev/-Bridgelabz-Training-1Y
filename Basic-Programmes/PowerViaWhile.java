import java.util.Scanner;
public class PowerViaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Enter power : ");
        int pow = sc.nextInt();
        int result = 1;
        while(pow>0){
            result *= n;
            pow--;
        }
        System.err.println(result);
    }
}