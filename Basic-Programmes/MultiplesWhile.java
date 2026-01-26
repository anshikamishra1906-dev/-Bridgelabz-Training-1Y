import java.util.Scanner;
public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n>0 && n<101){
            int i=n;
            while(i>0){
                if(n%i==0){
                    System.out.println(i);
                }
                i--;
            }
        }else{
            System.out.println("Invalid");
        }
    }
}