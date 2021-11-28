package com.travel.bean;

public class Passenger {
private String name,source,destination;
private int busid,age,pid;
@Override
public String toString() {
	return "Passenger [name=" + name + ", source=" + source + ", destination=" + destination
			+ ", person age= "+age+" , PersonID= "+pid+" , bus id="+busid+"]";
}
public Passenger(String name, String source, String destination,int busid, int age,int pid) {
	super();
	this.name = name;
	this.source = source;
	this.destination = destination;
	this.busid = busid;
	
	this.age=age;
	this.pid=pid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getBusid() {
	return busid;
}
public void setBusid(int busid) {
	this.busid = busid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
