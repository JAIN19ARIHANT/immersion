import java.util.Scanner;
public class celsiusToFahrenheit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the temprature in °C : ");
		double c = sc.nextDouble();
		
		double f = (9.0/5 * c) + 32;
		
		System.out.printf("%.2f°C in °F is %.2f°F", c,f);
	}
}
