package ninthHomework_GeorgiAndreev;

public class WorkingDaysDemo {

	public static void main(String[] args) {

		AllWork allWork1 = new AllWork();
		
		Employee stoqn = new Employee("Stoqn");
		stoqn.setAllwork(allWork1);
		Employee dragan = new Employee("Dragan");
		dragan.setAllwork(allWork1);
		Employee kolyo= new Employee("Kolyo");
		kolyo.setAllwork(allWork1);
		
		Task task1 = new Task("put tiles on roof", 11);
		allWork1.addTask(task1);
		Task task2 = new Task("paint living-room walls", 5);
		allWork1.addTask(task2);
		Task task3 = new Task("paint kitchen walls", 4);
		allWork1.addTask(task3);
		Task task4 = new Task("paint bedroom walls", 5);
		allWork1.addTask(task4);
		Task task5 = new Task("add parquet in rooms", 21);
		allWork1.addTask(task5);
		Task task6 = new Task("add woodwork", 19);
		allWork1.addTask(task6);
		Task task7 = new Task("paint corrider walls", 6);
		allWork1.addTask(task7);
		Task task8 = new Task("move all furniture", 10);
		allWork1.addTask(task8);
		Task task9 = new Task("paint big terrace walls", 3);
		allWork1.addTask(task9);
		Task task10 = new Task("paint small terrace walls", 2);
		allWork1.addTask(task10);
		
		int currentWorkingDay = 1;
		
		while(!allWork1.isAllWorkDone()) {
			System.out.println("\nWorking day ¹ " + currentWorkingDay++);
			kolyo.work();
			stoqn.work();
			dragan.work();
		}
	}

}
