import java.util.Scanner;
public class WhileFactorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        
        if(n>0){
            int factorial = 1;
            while(n>0){
            factorial*=n;
            n--;
           }
            System.out.println("factorial : "+factorial);
        }else{
            System.out.println("Not natural number");
        }
        
    }
}