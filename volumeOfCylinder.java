import java.util.Scanner;
public class volumeOfCylinder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the radius of cylinder : ");
		
		double r = sc.nextDouble();
		
		System.out.printf("Enter the height of cylinder : ");
		
		double h = sc.nextDouble();
		
		double v = Math.PI * r * r * h;
		
		System.out.printf("Volume of cylinder with the radius %.2f and height %.2f is %.2f", r,h,v);
	}
}
