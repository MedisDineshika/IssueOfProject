package com.pharmacy.service;

import java.util.Date;
import java.util.List;

import com.pharmacy.model.Disease;
import com.pharmacy.model.Item;

import com.pharmacy.model.Reg;

public interface ItemService {

	//Save the Item of Drugs 
	public void save (Item item );
	
	//Save the types of Diseases
	public void save ( Disease disease2);
	
	
	public List<Item> findAll();
	
	
	
	//Get the list of Items which is going to expire 
	public  List<Item> findByEXDBefore(Date EXD);

	
	
	//Get the list of items which are nearing the minimum stock count 
	public List<Item> findByQuantity(Long quantity);
	
	
	public List<Item>findByEXDMoreBefore(Date EXD);

	public List<Reg> findAllSuppliers();

	//public Object findAllSuppliers();
	
	
	
	
}
