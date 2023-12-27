public abstract class Employee {

	private String ssNum;
	private String name;
	private String email;
	private int numberOfEmployee;

	public String getSsNum() {
		return this.ssNum;
	}

	/**
	 * 
	 * @param ssNum
	 */
	public void setSsNum(String ssNum) {
		this.ssNum = ssNum;
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

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumberOfEmployee() {
		return this.numberOfEmployee;
	}

	/**
	 * 
	 * @param numberOfEmployee
	 */
	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

}