package ninthHomework_GeorgiAndreev;

class Employee {

	private static final int HOURS_IN_A_WORKING_DAY = 8;
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allwork;
	
	public Employee(String name) {
		if ((name != null) && (!name.equals(""))) {
			this.name = name;
		} else {
			name = "";
			System.out.println("Invalid name.");
		}
	}
	
	private void startWorkingDay() {
		this.hoursLeft = HOURS_IN_A_WORKING_DAY;
	}
	
	void work() {
		System.out.println("\n" + this.name + " working:");
		this.startWorkingDay();
		this.work(this.hoursLeft);
	}
	
	private void work(int hoursLeftForCurrentDay) {
		if (hoursLeftForCurrentDay <= 0) {
			System.out.println("End of day");
			return;
		}
		if (this.currentTask == null) {
			this.currentTask = Employee.allwork.getNextTask();
		}
		if (this.currentTask == null) {
			System.out.println("No more tasks left in all work.");
			return;
		}
		while ((hoursLeftForCurrentDay > 0) && (this.currentTask.getWorkingHours() > 0)) {
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - 1);
			hoursLeftForCurrentDay--;	
			this.hoursLeft = hoursLeftForCurrentDay;
		}
		if (hoursLeftForCurrentDay == this.currentTask.getWorkingHours()) {
			System.out.println(this.name + " finished working day and has no unfinished tasks.");
			this.currentTask = null;
		} else {
			if ((hoursLeftForCurrentDay == 0) && (this.currentTask.getWorkingHours() > 0)) {
				System.out.println(this.name + " finished working day and has the following unfinished task: " + this.currentTask.getName());
			} else {
				if ((hoursLeftForCurrentDay > 0) && (this.currentTask.getWorkingHours() == 0)) {
					System.out.println(this.name + " finished the following task: " + this.currentTask.getName() + " and will get another task today or will rest if no work left.");
					this.currentTask = null;
					work(hoursLeftForCurrentDay);
				}
			}
		}	
	}
	
	//method used in 7th homework
	@SuppressWarnings("unused")
	private void showReport() {
		System.out.println("Employee name: " + this.name);
		System.out.println("Current task name: " + this.currentTask.getName());
		System.out.println("Employee hours left: " + this.hoursLeft);
		System.out.println("Current task working hours left: " + this.currentTask.getWorkingHours());

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
	
	Task getCurrentTask() {
		return this.currentTask;
	}
	
	void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		} else {
			System.out.println("Invalid current task.");
		}
	}
	
	int getHoursLeft() {
		return this.hoursLeft;
	}
	
	void setHoursLeft(int workingHours) {
		if (workingHours > 0) {
			this.hoursLeft = workingHours;
		} else {
			System.out.println("Invalid working hours.");
		}
	}

	public AllWork getAllwork() {
		return allwork;
	}

	public void setAllwork(AllWork allwork) {
		if (allwork != null) {
			Employee.allwork = allwork;
		} else {
			System.out.println("Invalid all work.");
		}
		
	}
}
