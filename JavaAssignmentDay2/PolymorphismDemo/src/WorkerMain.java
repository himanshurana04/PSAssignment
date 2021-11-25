
public class WorkerMain {

	public static void main(String[] args) {
		SalariedWorker salaried=new SalariedWorker();
		DailyWorker daily=new DailyWorker();
		Salary salary = new Salary();
		salary.setWorker(daily);
		salary.displayPay();
        salary.setWorker(salaried);
        salary.displayPay();
	}

}
