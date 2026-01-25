import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (6,7,8,9) :");
        int n = sc.nextInt();
        if(n>5 && n<10){
            for(int i=1 ; i<11 ; i++){
                int product = n*i;
                System.out.println(n+" * "+i+" = "+product);
            }  
        }else{
            System.out.println("Invalid input");
        }
        
    }
}