package com.cd.bean;
import java.util.Comparator;

public class SortAsPerTitle implements Comparator<CD> {

	@Override
	public int compare(CD cd1, CD cd2) {
		
		return cd1.getTitle().compareTo(cd2.getTitle());
	}

}