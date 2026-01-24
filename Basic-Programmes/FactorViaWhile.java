import java.util.Scanner;
public class FactorViaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();
        System.out.println("Factors are :");
        int i = 1;
        while(i<=n){
            if(n%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}