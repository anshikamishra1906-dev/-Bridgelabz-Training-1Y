import java.util.Scanner;
public class SumUntil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter number : ");
            int m = sc.nextInt();
            if (m<=0){
                break;
            }
            sum += m;
        }
        System.out.println(sum);
    }
}