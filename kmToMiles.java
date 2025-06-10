import java.util.Scanner;
public class kmToMiles{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the distance in Kilo-Meters : ");
		
		double km = sc.nextDouble();
		
		double mi = km * 0.621371;
		
		System.out.printf("%.2f km is eual to %.3f miles",km, mi);
	}
}
