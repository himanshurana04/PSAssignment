
public class Worker {
private String name;
private int salaryrate,hours;
public void setName(String name) {
this.name=name;
}
public void setSalaryrate(int salaryrate) {
	this.salaryrate = salaryrate;
}
public String getName() {
	return name;
}
public int getSalaryrate() {
	return salaryrate;
}
public void pay() {
	System.out.println("Pay");
}
public void setHours(int hours) {
	this.hours = hours;
}
public int getHours() {
	return hours;
}
}
