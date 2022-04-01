package giadung.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import giadung.Entity.Categories;
import giadung.Entity.Products;
import giadung.Mapper.CategoriesMapper;
import giadung.Mapper.ProductsMapper;

@Repository
public class ProductsDao extends BaseDao {
	String _sqlHotProductString = "SELECT * FROM products WHERE hot_product = 1 ";
	String _sqlNewProductString = "SELECT * FROM products WHERE new_product = 1 ";
	
	public List<Products> GetDataProductsHot() {
		String sql = _sqlHotProductString + "ORDER BY id DESC LIMIT 4";
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
		return listProducts;
	}

	public List<Products> GetDataProductsHotLast() {
		String sql = _sqlHotProductString + "ORDER BY id ASC LIMIT 4";
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
		return listProducts;
	}

	public List<Products> GetDataProductsNew() {
		String sql = _sqlNewProductString + "ORDER BY id DESC LIMIT 6";
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
		return listProducts;
	}

	public List<Products> GetDataProductsSideBar() {
		String sql = _sqlHotProductString + " ORDER BY RAND() DESC LIMIT 3";
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
		return listProducts;
	}

//	public List<Products> GetProductById(long id) {
//		String sql = "SELECT products.*, categories.name From products INNER JOIN categories ON products.id_category = categories.id Where products.id = "
//				+ id + "";
//		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
//		return listProducts;
//	}
	
	public Products GetProductById(long id) {
		String sql = "SELECT products.*, categories.name From products INNER JOIN categories ON products.id_category = categories.id Where products.id = "
				+ id + "";
		Products product = _jdbcTemplate.queryForObject(sql, new ProductsMapper());
		return product;
	}

	public List<Products> GetAllProduct() {
		String sql = "SELECT * FROM products ";
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
		return listProducts;
	}

	public List<Products> GetAllProductPaginates(int start, int limit) {
		String sql = "SELECT * FROM products LIMIT " + (--start) + "," + limit;
		List<Products> listProducts = _jdbcTemplate.query(sql, new ProductsMapper());
		return listProducts;
	}
}
