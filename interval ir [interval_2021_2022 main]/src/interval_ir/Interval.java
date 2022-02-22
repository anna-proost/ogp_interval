package interval_ir;

// import interval_ir.interval_test.Interval;


// private is niet zichtbaar door klant
// en mag dus ook niet hierdoor worden gebruikt

public class Interval {
		private int ondergrens;
		private int lengte;
	
	// zonder static = instantiemethode
	// impliciete parameter
		
	public int getOndergrens() {
		return this.ondergrens;
	}
	
	public void setOndergrens(int waarde) {
		this.ondergrens = waarde;
	}
	
	public Interval(int ondergrens, int bovengrens) {			// klasse public dus constructor ook !
		this.ondergrens = ondergrens;
		this.lengte = bovengrens - ondergrens;
	}
	
	public int getBovengrens() {
		return this.ondergrens + this.lengte;
	}
	
	public void setBovengrens(int waarde) {
		this.lengte = waarde - this.ondergrens;
	}
	
	public int getLengte() {
		return this.lengte;
	}
	
}	