package com.foodize.dao;

import java.util.List;

import com.foodize.model.Restaurent;

public interface RestaurentDAO {
	
	void addRestaurent(Restaurent restaurentId);
	Restaurent getRestaurent(int restaurentId);
	void updateRestaurent(Restaurent restaurent);
	void deleteRestaurent(int restaurentId);
	List<Restaurent> getAllRestaurents();

}
