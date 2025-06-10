import java.util.Scanner;
public class average{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the 1st number : ");
		
		double a = sc.nextDouble();
		
		System.out.printf("Enter the 2st number : ");
		
		double b = sc.nextDouble();
		
		System.out.printf("Enter the 3st number : ");
		
		double c = sc.nextDouble();
		
		double avg = (a+b+c)/3;
		
		System.out.printf("Average of %f %f %f is %f",a,b,c,avg);
	}
}
