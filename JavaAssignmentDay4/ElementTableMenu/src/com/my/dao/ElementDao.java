package com.my.dao;
import com.my.bean.Element;
import java.util.ArrayList;
public interface ElementDao {
	    ArrayList<Element> getAllElement();
		int deleteElement(String symbol);
		int updateElementBySymbol(String symbol,int Weight);
	
	
	
}
