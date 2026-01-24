import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day:");
        int day = scanner.nextInt();
        System.out.print("Enter Month:");
        int month = scanner.nextInt();
        if (month>=3 && month<=6 ){
            if((month==3 && day>=20)||(month==6 && day<=20)|| month==4 || month==5){
            System.out.println("Spring Season!");
            }
        }
        else{
            System.out.println("It is not Spring Season!");
        }
        scanner.close();
    }
}