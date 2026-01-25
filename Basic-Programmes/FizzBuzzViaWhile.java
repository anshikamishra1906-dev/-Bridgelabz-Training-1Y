import java.util.Scanner;
public class FizzBuzzViaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        if(n>0){
            int i =1;
            while(i<n+1){
                if(i%3==0 && i%5 ==0){
                    System.out.println("FizzBuzz");
                }else if(i%5==0){
                    System.out.println("Buzz");
                }else if(i%3==0){
                    System.out.println("Fizz");
                }else{
                    System.out.println(i);
                }
                i++;
            }
        }else{
            System.out.println("Number is not positive");
        }
    }
}