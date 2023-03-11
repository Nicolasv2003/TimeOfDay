package timeofday;
// !!! In Java kan je niet een keten maken van ongelijkheden, max 2 bij elkaar !!!

/**
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay {
	
	/**
	 * @invar | 0 <= minutesSinceMidnight && minutesSinceMidnight <= 60*24
	 */
	private int minutesSinceMidnight;
	
	public int getHours() {
		return minutesSinceMidnight/60;
	}
	public int getMinutes() {
		return minutesSinceMidnight%60;
	}
	
	/**
	 * @throws IllegalArgumentException | hours < 0 || hours > 23
	 * @throws IllegalArgumentException | minutes < 0 || minutes > 59
	 * @mutates |
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) {
		if (hours < 0 || hours > 23)
			throw new IllegalArgumentException("'hours' out of range");
		if (minutes < 0 || minutes > 59)
			throw new IllegalArgumentException("'minutes' out of range");
		this.minutesSinceMidnight = hours*60 + minutes;
	}
	
	/**
	 * @pre | 0 <= hours && hours <= 23
	 * @mutates | this
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) { 
		this.minutesSinceMidnight = hours*60 + minutesSinceMidnight%60;
	}
	
	/**
	 * @pre | 0 <= minutes && minutes <= 59
	 * @mutates | this
	 * @post | getHours() == old(getHours())
	 * @post | getMinutes() == minutes
	 */
	public void setMinutes(int minutes) {
		this.minutesSinceMidnight = minutes + (minutesSinceMidnight/60)*60;
	}
}
