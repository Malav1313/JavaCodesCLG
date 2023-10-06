//write a program to calculate distance between two cities using their latitiudes and longitudes
import java.util.Scanner;
public class distanceusingLatLong
{
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter Latitude of 1st City : ");
		double latitude1 = scanner.nextDouble();
		
		System.out.println("Enter longitude of 1st City : ");
		double longitude1 = scanner.nextDouble();
		
		System.out.println("Enter Latitude of 2nd City : ");
		double latitude2 = scanner.nextDouble();
		
		System.out.println("Enter Longitude of 2nd City : ");
		double longitude2 = scanner.nextDouble();
		
		final double rad = 6378.1;
		
		latitude1 = Math.toRadians(latitude1);
		latitude2 = Math.toRadians(latitude2);
		longitude1 = Math.toRadians(longitude1);
		longitude2 = Math.toRadians(longitude2);
		
		double dlat = latitude2 - latitude1;
		double dlon = longitude1 - longitude2;
		double a = Math.pow(Math.sin(dlat/2), 2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.pow(Math.sin(dlon/2), 2);
		
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		double distance = rad * c;
		
		 System.out.println("Distnace between Two Cities is " + distance + "Kilometers");

		
		
	}
}
