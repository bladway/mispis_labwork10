public class Institute {

	private String name;
	private String adress;

	/**
	 * 
	 * @param course
	 * @param lecturer
	 * @param newShedule
	 */
	public void updateShedule(Course course, Lecturer lecturer, String newShedule) {
		course.setShedule(newShedule);
		lecturer.setShedule(newShedule);
	}

	/**
	 * 
	 * @param researchPersonal
	 */
	public void makePlanOfProjects(ResearchPersonal researchPersonal) {
		researchPersonal.chooseProject(null);
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

	public String getAdress() {
		return this.adress;
	}

	/**
	 * 
	 * @param adress
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

}