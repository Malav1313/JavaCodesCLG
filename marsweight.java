import java.util.Scanner;
public class marsweight{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Weight on Earth : ");
        double weightE = scanner.nextDouble();

        double marsweight = weightE * 0.38;

        System.out.println("Weight on Mars is : " + marsweight);

    }
}