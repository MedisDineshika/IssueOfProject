package com.pharmacy.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pharmacy.dao.ItemDao;
import com.pharmacy.model.Disease;
import com.pharmacy.model.Item;

import com.pharmacy.model.Reg;

@Service
@Transactional

public class ItemServiceImpl implements ItemService  {

	//Autowire the ItemDao 
	@Autowired ItemDao itemDao ;
	
	
	
	@Override
	//Save the Item 
	public void save(Item item) {
		itemDao.save(item);
		
	}
	//Save the types of Deseses
	@Override
	public void save(Disease disease2) {
		itemDao.save(disease2);
		
	}

	@Override
	public List<Item> findAll() {
		return itemDao.findAll();
		
	}
	
	
	//Get the list of items which are going to expire within the given period 
	@Override
	public  List<Item> findByEXDBefore(Date EXD) {
		return itemDao.findByEXDBefore(EXD);
		
		
	}

	
	//Get the list of items which are nearing the minimum stock count 
	@Override
	public List<Item> findByQuantity(Long quantity) {
		return itemDao.findByQuantity(quantity);
	}

	
	@Override
	public List<Item> findByEXDMoreBefore(Date EXD) {
		return itemDao.findByEXDMoreBefore(EXD);
	}

	@Override
	public List<Reg> findAllSuppliers() {
		
		return itemDao.findAllSuppliers();
	}

	
	
	
	
}
