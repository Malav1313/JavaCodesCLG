import java.util.Scanner;
import java.time.LocalDate;



public class dPrac{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter DOB (YYYY-MM-DD) : ");
        String dt1 = scanner.nextLine();

        LocalDate localDate1 = LocalDate.parse(dt1);
        // System.out.println(localDate1);

        int year1 = localDate1.getYear();
        // System.out.println(year1);


        LocalDate localDate2 = LocalDate.now();
        int year2 = localDate2.getYear();

        int age = year2-year1;

        System.out.println("Your are " + age + " years old." );







        


















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