package ninthHomework_GeorgiAndreev;

class Task {

	private String name;
	private int workingHours;
	
	Task(String name, int workingHours) {
		if ((name != null) && (!name.equals(""))) {
			this.name = name;
		} else {
			name = "";
			System.out.println("Invalid name.");
		}
		if (workingHours > 0) {
			this.workingHours = workingHours;
		} else {
			System.out.println("Invalid working hours.");
		}
	}
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		if ((name != null) && (!name.equals(""))) {
			this.name = name;
		} else {
			System.out.println("Invalid name.");
		}
	}
	
	int getWorkingHours() {
		return this.workingHours;
	}
	
	void setWorkingHours(int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		} else {
			System.out.println("Invalid working hours.");
		}
	}
	
	
}
