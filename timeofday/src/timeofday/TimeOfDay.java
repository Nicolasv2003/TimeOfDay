package timeofday;
// !!! In Java kan je niet een keten maken van ongelijkheden, max 2 bij elkaar !!!

/**
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay {
	
	/**
	 * @invar | 0 <= hours && hours <= 23
	 * @invar | 0 <= minutes && minutes <= 59
	 */
	private int hours;
	private int minutes;
	
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minutes;
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
		this.hours = hours;
		this.minutes= minutes;
	}
	
	/**
	 * @pre | 0 <= hours && hours <= 23
	 * @mutates | this
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	/**
	 * @pre | 0 <= minutes && minutes <= 59
	 * @mutates | this
	 * @post | getMinutes() == minutes
	 * @post | getHours() == old(getHours())
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
