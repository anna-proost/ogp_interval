package interval_ir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class interval_test {
	
	// verschillende voorstellingen voor hetzelfde idee
	// verschillende voorstellingen voor eenzelfde abstracte toestandsruimte
	
	class Interval {
		int ondergrens;
		int bovengrens;
	}
	
	int getLengte(Interval interval) {
		return interval.bovengrens - interval.ondergrens;
	}
	
	class Interval2 {
		int ondergrens;
		int lengte;				
	}

	@Test
	void test() {
		Interval mijnInterval = new Interval();		// velden initieel allemaal waarde 0
		assertEquals(0, mijnInterval.ondergrens);
		assertEquals(0, mijnInterval.bovengrens);
		
		mijnInterval.bovengrens = 2;
		assertEquals(2, mijnInterval.bovengrens);
		
		assertEquals(2, getLengte(mijnInterval));
	}

}
