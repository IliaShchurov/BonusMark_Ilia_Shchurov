import java.util.Scanner;
public class EmployeeDemo {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Employee obj = new Employee();
		
		System.out.println("Enter name of employee");
		obj.name = input.nextLine();
		
		System.out.println("Enter amount of hours");
		obj.hours = input.nextDouble();	
		
		obj.setTotalPay(obj.getHours());
		System.out.println("Total payment is: " + obj.getTotalPay() + "$");
	}
}
