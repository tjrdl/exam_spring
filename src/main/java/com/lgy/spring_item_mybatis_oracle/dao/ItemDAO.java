package com.lgy.spring_item_mybatis_oracle.dao;

import java.util.ArrayList;

import com.lgy.spring_item_mybatis_oracle.dto.ItemDTO;

public interface ItemDAO {
	public void write(String name, String price, String description);
	public ArrayList<ItemDTO> list();
	
}
