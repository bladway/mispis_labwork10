public class Faculty {

	private String name;

	/**
	 * 
	 * @param institute
	 */
	public void makeShedule(Institute institute) {
		institute.updateShedule(null, null, null);
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

}