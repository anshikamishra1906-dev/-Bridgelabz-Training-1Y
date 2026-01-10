import java.util.Scanner;
public class CelsiustoFahrenheitConversion{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Temperature in Fahrenheit : ");
       float Celcius = scanner.nextFloat();
       float Conversion = (Celcius * (9/5)) + 32;
       System.out.println("Temperature in Fahrenheit : "+ Conversion);
  }
}