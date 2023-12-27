public class Project {

	private String name;
	private String start;
	private String end;

	public void doProject() {
		System.out.println("project done");
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

	public String getStart() {
		return this.start;
	}

	/**
	 * 
	 * @param start
	 */
	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return this.end;
	}

	/**
	 * 
	 * @param end
	 */
	public void setEnd(String end) {
		this.end = end;
	}

}