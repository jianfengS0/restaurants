package cn.duozhilin.restaurants.dao;

import java.util.List;
import java.util.Map;

import cn.duozhilin.restaurants.bean.Restaurant;

public interface RestaurantDAO {
	
	List<Restaurant> findAll();

	List<Restaurant> find(int offset, int length);

	List<Restaurant> findByPropertitys(Map<String, Object> propertitys);
	
	List<Restaurant> findByPropertitys(Map<String, Object> propertitys, int offset, int length);

	void save(Restaurant restaurant);

	void delete(Restaurant restaurant);

	void update(Restaurant restaurant, boolean createIfMissing, Map<String, Object> conditions);
}
