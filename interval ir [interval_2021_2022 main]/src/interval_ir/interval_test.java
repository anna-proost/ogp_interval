package interval_ir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class interval_test {
	
	// verschillende voorstellingen voor hetzelfde idee
	// verschillende voorstellingen voor eenzelfde abstracte toestandsruimte
	
	// representatie encapsuleren !! niet rechtstreeks velden gebruiken MAAR opvragen
	
	@Test
	void test() {
		Interval mijnInterval = new Interval();		// velden initieel allemaal waarde 0
		assertEquals(0, mijnInterval.getOndergrens());
		assertEquals(0, mijnInterval.getBovengrens());
		
		mijnInterval.setBovengrens(2);
		assertEquals(2, mijnInterval.getBovengrens());
		
		assertEquals(2, mijnInterval.getLengte());
	}

}
