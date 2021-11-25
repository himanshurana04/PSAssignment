
public class DailyWorker extends Worker {
	public DailyWorker() {
	
	setName("raj");
	setSalaryrate(60);
	setHours(50);
	}
	public void pay() {
		int rate=getSalaryrate();
		int hours=getHours();
		int salary=(hours/24)*rate;
		String name=getName();
		System.out.println(name+" is daily worker with salary of  : "+salary);

	}
}
