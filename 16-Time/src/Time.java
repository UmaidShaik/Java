
public class Time {
	
	private int hours;
	private int minutes;
	private int secs;
	
	

	public Time(int hours, int minutes, int secs) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.secs = secs;
	}
	public Time() {
		
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSecond() {
		return secs;
	}
	public void setSecond(int secs) {
		this.secs = secs;
	}
	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + ", secs=" + secs + "]";
	}

	

}
