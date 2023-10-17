import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// Take input from User
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = scan.nextInt();
		System.out.println("Enter your name = ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("Enter your gender = ");
		char gender = scan.next().charAt(0);
		System.out.println("Enter your salary = ");
		double salary = scan.nextDouble();
		// To print data provided by the user 
		System.out.println("Your name = " + name);
		System.out.println("Your age = "+ age);
		System.out.println("Your gender = " + gender);
		System.out.println("Your salary = " + salary);
		//release the resources
		scan.close();
		

	}

}
