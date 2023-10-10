import java.util.Scanner;

public class dist{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Latitude of 1st place : ");
        double Latitude1 = scanner.nextDouble();


        System.out.println("Enter longitude of 1st place : ");
        double Longitude1 = scanner.nextDouble();


        System.out.println("Enter Latitude of 2nd place : ");
        double Latitude2 = scanner.nextDouble();


        System.out.println("Enter longitude of 2nd place : ");
        double Longitude2 = scanner.nextDouble();


        double dLatitude = Latitude2 - Latitude1;
        double dLongitude = longitude2 - longitude1;


        double dLatitudeRadian = Math.toRadians(dLatitude);
        double dLongitudeRadian = Math.toRadians(dLongitude);


        




















        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter Latitude of 1st point : ");
        // double latitude1 = scanner.nextDouble();
        
        // System.out.println("Enter longitude of 1st point : ");
        // double longitude1 = scanner.nextDouble();


        // System.out.println("Enter Latitude of 2nd point : ");
        // double latitude2 = scanner.nextDouble();
        
        // System.out.println("Enter longitude of 2nd point : ");
        // double longitude2 = scanner.nextDouble();


        // double dlatitude = latitude2 - latitude1;
        // double dlongitude = longitude2 - longitude1;


        // double dlatitudeRadian = Math.toRadians(dlatitude);
        // double dlongitudeRadian = Math.toRadians(dlongitude);


        // double distance = Math.sin(dlatitudeRadian / 2) * Math.sin(dlatitudeRadian / 2) + 
        // Math.cos(latitude1) * Math.cos(latitude2) * Math.sin(dlongitudeRadian / 2) * Math.sin(dlongitudeRadian / 2);


        // distance = 2 * Math.atan2(Math.sqrt(distance), Math.sqrt(1-distance));

        // distance = distance * 6371;

        // System.out.println("Distance : " + distance + " Kms");
    }
}