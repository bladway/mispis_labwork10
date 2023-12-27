public class Course {

	private int ID;
	private String name;
	private int weeklyDuration;
	private String shedule;

	public int getID() {
		return this.ID;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getWeeklyDuration() {
		return this.weeklyDuration;
	}

	/**
	 * 
	 * @param weeklyDuration
	 */
	public void setWeeklyDuration(int weeklyDuration) {
		this.weeklyDuration = weeklyDuration;
	}

	public String getShedule() {
		return this.shedule;
	}

	/**
	 * 
	 * @param shedule
	 */
	public void setShedule(String shedule) {
		this.shedule = shedule;
	}

}