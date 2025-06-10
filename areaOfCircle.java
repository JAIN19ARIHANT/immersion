import java.util.Scanner;
public class areaOfCircle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the radius of cicle : ");
		
		double r = sc.nextDouble();
		
		double a = Math.PI * r * r;
		
		System.out.printf("Area of circle with the radius %f is %f", r,a);
	}
}
