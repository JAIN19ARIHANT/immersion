import java.util.Scanner;
public class powerFunction{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the base : ");
		
		double b = sc.nextDouble();
		
		System.out.print("Enter the exponent : ");
		
		double e = sc.nextDouble();
		
		double pow = Math.pow(b,e);
		
		System.out.printf("Perimeter is %.1f", pow);
	}
}
