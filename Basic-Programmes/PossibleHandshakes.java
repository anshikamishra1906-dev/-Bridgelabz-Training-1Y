import java.util.Scanner;
public class PossibleHandshakes{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Number of Students:");
	int total_Students = input.nextInt();
	double max_PossibleHandshakes = (total_Students *(total_Students-1))/2;
	System.out.println("Number of possible handshakes: "+ max_PossibleHandshakes);
	}
}