import java.util.Scanner;
public class simpleInterest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the Principal Amount (in ₹) : ");
		
		double p = sc.nextDouble();
		
		System.out.print("Enter the Rate (int %) : ");
		
		double r = sc.nextDouble();
		
		System.out.printf("Enter the Time (in years) : ");
		
		double t = sc.nextDouble();
		
		double si = (p*r*t)/100;
		
		System.out.printf("Your intrest is %.2f", si);

    sc.close();
	}
}
