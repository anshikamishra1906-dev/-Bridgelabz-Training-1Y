import java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();
        System.out.println("Factors are :");
        int max=0;
        int i=1;
        while(i<n){
            if(n%i==0){
                if(i>max){
                    max=i;
                }
            }
        }
        System.out.println("Greatest factor is "+max);
    }
}