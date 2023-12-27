public class ResearchPersonal extends Employee {

	/**
	 * 
	 * @param project
	 */
	public void chooseProject(Project project) {
		project.doProject();
	}

	public void makeAProjectReport() {
		System.out.println("project Report made");
	}

}