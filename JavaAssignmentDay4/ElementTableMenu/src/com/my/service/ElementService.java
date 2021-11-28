package com.my.service;

import java.util.ArrayList;

import com.my.bean.Element;

public interface ElementService {
	 ArrayList<Element> getAll();
		boolean removeEmployee(String symbol);
		boolean updateElement(String symbol,int Weight);
}
