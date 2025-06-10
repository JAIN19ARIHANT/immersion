import java.util.Scanner;
public class addTwoNumbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the first number : ");
		int a = sc.nextInt();
		System.out.printf("Enter the first number : ");
		int b = sc.nextInt();
		
		System.out.printf("Sum of %d and %d is %d",a,b,a+b);
	}
}
