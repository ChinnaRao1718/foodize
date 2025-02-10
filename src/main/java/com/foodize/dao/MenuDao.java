/**
 * 
 */
package com.foodize.dao;

import java.util.List;

import com.foodize.model.Menu;

/**
 * 
 */
public interface MenuDao {
	void addMenu(Menu menu);
	Menu getMenu(int menuId);
	void updateMenu(Menu menu);
	void deleteMenu(int menuId);
	List<Menu> getAllMenusByResataurent(int restaurentId);;

}
