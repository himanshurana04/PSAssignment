package oop.modular.demo;

public class MyDemo {
private int number,reverse;

public void setNumber(int number) {
	this.number=number;
}
public int getReverse() {
	findReverse();
	return reverse;
}
private void findReverse() {
	reverse=0;
	while(number>0){
		int temp=number%10;
		reverse=reverse*10+temp;
		number=number/10;
	}
}
}
