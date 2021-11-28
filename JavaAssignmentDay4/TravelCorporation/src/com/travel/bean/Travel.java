package com.travel.bean;

public class Travel {
private int id,capacity;
private String source,destination;
public Travel(int id, int capacity, String source, String destination) {
	super();
	this.id = id;
	this.capacity = capacity;
	this.source = source;
	this.destination = destination;
}
@Override
public String toString() {
	return "Travel [id=" + id + ", capacity=" + capacity + ", source=" + source + ", destination=" + destination + "]";
}

}
