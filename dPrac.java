import java.util.Scanner;
import java.time.LocalDate;
// import java.time.Period;


public class dPrac{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthdate(YYYY-MM-DD) : ");
        String dt = scanner.nextLine();
        
        LocalDate localDate = LocalDate.parse(dt);
        // System.out.println("Date : " + localDate);
        int year1 = localDate.getYear();
        
        LocalDate localDt2 = LocalDate.now();
        // System.out.println(localDt2);

        int year2 = localDt2.getYear();

        int age  = year2-year1;
        System.out.println(age);



        


















        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter your date of birth (YYYY-MM-DD) : ");
        // String dt = scanner.nextLine();
        
        // LocalDate localDate = LocalDate.parse(dt);
        // // System.out.println("Date :" + localDate);

        // int year1 = localDate.getYear();
        // // System.out.println("Year :" + year1);



        // LocalDate ldte2 = LocalDate.now();

        // // System.out.println("Date : " + ldte2);

        // int year2 = ldte2.getYear();

        // int age = year2-year1;

        // System.out.println("Your Age is : " + age);
    }
}