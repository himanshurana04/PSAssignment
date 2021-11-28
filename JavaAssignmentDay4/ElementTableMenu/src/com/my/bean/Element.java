package com.my.bean;

public class Element {
public String symbol;
 public int atomicWeight;
 public String name;
 
public Element(String symbol, int atomicWeight, String name) {
	super();
	this.symbol = symbol;
	this.atomicWeight = atomicWeight;
	this.name = name;
}
public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
public int getAtomicWeight() {
	return atomicWeight;
}
public void setAtomicWeight(int atomicWeight) {
	this.atomicWeight = atomicWeight;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Element [symbol=" + symbol + ", atomicWeight=" + atomicWeight + ", name=" + name + "]";
}
 
}
