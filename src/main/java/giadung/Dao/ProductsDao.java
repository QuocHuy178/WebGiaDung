package giadung.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import giadung.Entity.Products;
import giadung.Mapper.ProductsMapper;
@Repository
public class ProductsDao extends BaseDao {
	public List<Products> GetDataProductsHot() {
		String sql ="SELECT * FROM products WHERE hot_product = 1 ORDER BY id DESC LIMIT 4";
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
				return listProducts;
	}
	public List<Products> GetDataProductsHotLast() {
		String sql ="SELECT * FROM products WHERE hot_product = 1 ORDER BY id ASC LIMIT 4";
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
				return listProducts;
	}
	
	public List<Products> GetDataProductsNew() {
		String sql ="SELECT * FROM products WHERE new_product = 1 ORDER BY id DESC LIMIT 6";
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
				return listProducts;
	}
	
	public List<Products> GetDataProductsSideBar() {
		String sql ="SELECT * FROM products WHERE new_product = 1 ORDER BY RAND() DESC LIMIT 3";
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
				return listProducts;
	}
	public List<Products> GetProductById(long id) {
		String sql ="SELECT products.*, categories.name From products INNER JOIN categories ON products.id_category = categories.id Where products.id = "+id+"";
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
				return listProducts;
	}
	
//	public List<Products> GetDataAllProductsById(int id) {
//		String sql = "SELECT * FROM `product` WHERE FIND_IN_SET('$id', `id_category`)";
//		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
//				return listProducts;
//	}
}
 