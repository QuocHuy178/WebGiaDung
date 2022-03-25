package giadung.Dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import giadung.Entity.Categories;
import giadung.Entity.MapperCategories;

@Repository	
public class CategoryDao extends BaseDao  {
	
	public List<Categories>getDataCategories(){
		List<Categories> list = new ArrayList<Categories>();
		String sql = "SELECT * FROM categories" ;
		list = _jdbcTemplate.query(sql, new MapperCategories());
		return list;
	}
}
