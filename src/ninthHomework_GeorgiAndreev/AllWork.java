package ninthHomework_GeorgiAndreev;

public class AllWork {

	private static final int MAX_NUMBER_OF_TASKS = 10;
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	public AllWork() {
		this.tasks = new Task[MAX_NUMBER_OF_TASKS];
		this.freePlacesForTasks = MAX_NUMBER_OF_TASKS;
	}

	void addTask(Task task) {
		if (task != null) {
			if (freePlacesForTasks == 0) {
				System.out.println("Cannot add task because there are no empty places for new tasks.");
			}
			if (freePlacesForTasks > 0) {
				this.tasks[MAX_NUMBER_OF_TASKS - freePlacesForTasks] = task;
				this.freePlacesForTasks--;
			}
		} else {
			System.out.println("Invalid task.");
		}
	}

	Task getNextTask() {
		if (this.currentUnassignedTask > this.tasks.length - 1) {
			System.out.println("No more unassigned tasks to be taken.");
			return null;
		}
		Task nextTask = this.tasks[this.currentUnassignedTask];
		this.currentUnassignedTask++;
		return nextTask;
	}

	boolean isAllWorkDone() {
		if (this.currentUnassignedTask > this.tasks.length - 1) {
			for (int index = 0; index < tasks.length; index++) {
				if(this.tasks[index].getWorkingHours() != 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
