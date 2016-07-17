package ninthHomework_GeorgiAndreev;

public class TaskEmployeeDemo {

	public static void main(String[] args) {

		Employee ivan = new Employee("Ivan");
		Task task1 = new Task("task1", 4);
		ivan.setCurrentTask(task1);
		ivan.setHoursLeft(3);
		ivan.work();
		
	}

}
