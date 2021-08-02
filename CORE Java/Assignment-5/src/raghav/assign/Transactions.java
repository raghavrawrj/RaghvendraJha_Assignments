package raghav.assign;

public class Transactions {
	int year,value;
	Traders t;
	public Transactions(int year, int value, Traders t) {
		super();
		this.year = year;
		this.value = value;
		this.t = t;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Traders getT() {
		return t;
	}
	
	@Override
	public String toString() {
		return "trasaction [year=" + year + ", value=" + value + ", t=" + t + "]";
	}
	public void setT(Traders t) {
		this.t = t;
	}
	


}
