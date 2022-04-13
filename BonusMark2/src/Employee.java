
public class Employee {
	String name;
	double hours;
	double totalPay;
	final double NORMAL = 15, OVERTIME = 16.5;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double getTotalPay() {
		return totalPay;
	}
	public void setTotalPay(double hours) {
		if(hours <= 40) {
			this.totalPay = hours * NORMAL;
		} else this.totalPay = 40 * NORMAL + (hours - 40) * OVERTIME;
	}
	
}
