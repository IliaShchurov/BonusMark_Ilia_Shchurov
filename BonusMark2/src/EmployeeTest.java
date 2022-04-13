import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testGetTotalPay() {
		Employee obj = new Employee();
		
		double hours1 = 35;
		obj.setTotalPay(hours1);
		assertEquals(525.0, obj.getTotalPay());
		
		double hours2 = 50;
		obj.setTotalPay(hours2);
		assertEquals(765.0, obj.getTotalPay());
	}

}
