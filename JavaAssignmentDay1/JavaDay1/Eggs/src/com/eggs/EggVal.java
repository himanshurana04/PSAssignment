package com.eggs;

public class EggVal {
private int gross,dozen,remaining,Total;
public void setTotal(int total) {
	this.Total = total;
}

private void getValues() {
	if(Total>=144) {
		gross=Total/144;
		Total=Total-gross*144;
	}
	if(Total>=12 && Total<144) {
		dozen=Total/12;
		Total=Total-dozen*12;
	}
	if(Total<12) {
		remaining=Total;
	}
}

public void displayTotal() {
	getValues();
	System.out.println(gross+" gross, "+dozen+" dozen, "+remaining+" eggs remaining");
}
}
