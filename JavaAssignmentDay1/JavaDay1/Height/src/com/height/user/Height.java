package com.height.user;

public class Height {

	private int feet,inches;
	public Height() {
		feet=0;
		inches=0;
	}
	public Height(int feet,int inches) {
		this.feet=feet;
		this.inches=inches;
		if(inches>11) {
		this.feet+=inches/12;
		this.inches%=12;
	}}
	public void displayHeight() {
		//findHeight();
		System.out.println("Height is : "+feet+" feet "+inches+" inches ");
	}
	/*private void findHeight() {
		while(inches>11) {
			inches=inches-12;
			feet=feet+1;
			
		}
	}*/
}
