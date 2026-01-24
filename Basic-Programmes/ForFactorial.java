import java.util.Scanner;
public class ForFactorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        
        if(n>0){
            int factorial = 1;
            for(int i=n;i>0;i--){
                factorial*=i; 
            }
            System.out.println("factorial : "+factorial);
        }else{
            System.out.println("Not natural number");
        }
    }
}