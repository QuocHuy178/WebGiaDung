package giadung.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import giadung.Entity.Categories;
import giadung.Entity.Products;
import giadung.Mapper.CategoriesMapper;
import giadung.Mapper.ProductsMapper;

@Repository
public class CategoryDao extends BaseDao {

	private String getProByCate = "SELECT * FROM products as p INNER JOIN categories as c ON p.id_category = c.id WHERE p.id_category = ";
	
	public List<Categories> GetDataCategories() {
		List<Categories> list = new ArrayList<Categories>();
		String sql = "SELECT * FROM categories";
		list = _jdbcTemplate.query(sql, new CategoriesMapper());
		return list;
	}

	public List<Products> GetProductByCate(int id) {
		String sql = getProByCate + id;
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
		return listProducts;
	}

	public List<Products> GetAllProductByCatePaginates(int id, int start, int end) {
		String sql = getProByCate + id + " LIMIT " + start + "," + end;
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
		return listProducts;
	}
}
