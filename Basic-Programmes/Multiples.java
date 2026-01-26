import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n>0 && n<101){
            for(int i=n ; i>0 ; i--){
                if(n%i==0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Invalid");
        }
    }
}