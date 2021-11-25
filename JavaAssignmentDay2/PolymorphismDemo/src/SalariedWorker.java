
public class SalariedWorker extends Worker {
public SalariedWorker() {
	
	setName("aman");
	setSalaryrate(200);
	setHours(50);
	
}
public void pay() {
	int rate=getSalaryrate();
	int hours=getHours();
	int salary=40*rate;
	String name=getName();
	System.out.println(name+" is salaried worker with slary per week of: "+salary);

}
}