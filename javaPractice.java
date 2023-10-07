import java.util.Scanner;

public class javaPractice {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String uName = scanner.nextLine();
        System.out.println("You Entered : " + uName);
    }
}