import java.util.Scanner;
public class Bonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary :");
        int salary = sc.nextInt();
        System.out.print("Enter year of service :");
        int year = sc.nextInt();
        int bonus = (salary*year)/100;
        System.out.println("BONUS : "+bonus);
    }
}