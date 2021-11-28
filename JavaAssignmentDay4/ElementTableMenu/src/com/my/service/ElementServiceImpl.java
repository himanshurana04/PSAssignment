package com.my.service;
import com.my.dao.*;
import java.util.ArrayList;

import com.my.bean.Element;

public class ElementServiceImpl implements ElementService {
    ElementDaoImpl ele=new ElementDaoImpl();
	@Override
	public ArrayList<Element> getAll() {
		
		return ele.getAllElement();
	}

	@Override
	public boolean removeEmployee(String symbol) {
		int rows=ele.deleteElement(symbol);
		if(rows>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateElement(String symbol, int Weight) {
		int rows=ele.updateElementBySymbol(symbol, Weight);
		if(rows>0)
			return true;
		return false;
	}

}
