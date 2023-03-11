package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay ochtend = new TimeOfDay(10,30);
		
		ochtend.setHours(18);
		ochtend.setMinutes(45);
		assertEquals(18, ochtend.getHours());
		assertEquals(45, ochtend.getMinutes());
	}

}
