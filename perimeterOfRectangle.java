import java.util.Scanner;
public class perimeterOfRectangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the length (in cm) : ");
		
		double l = sc.nextDouble();
		
		System.out.print("Enter the width (in cm) : ");
		
		double w = sc.nextDouble();
		
		double peri = 2 * (l + w);
		
		System.out.printf("Perimeter is %.2f", peri);
	}
}
