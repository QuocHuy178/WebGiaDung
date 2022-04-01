package giadung.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import giadung.Dto.ProductsDto;
import giadung.Dto.ProductsDtoMapper;

@Repository
public class ProductsDao extends BaseDao {

	public List<ProductsDto> getDataProductsHot() {
		String sql = "SELECT * FROM products WHERE hot_product = 1 ORDER BY id DESC LIMIT 4";
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}

	public List<ProductsDto> getDataProductsHotLast() {
		String sql = "SELECT * FROM products WHERE hot_product = 1 ORDER BY id ASC LIMIT 4";
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}

	public List<ProductsDto> getDataProductsNew() {
		String sql = "SELECT * FROM products WHERE new_product = 1 ORDER BY id DESC LIMIT 12";
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}

	public List<ProductsDto> getDataProductsSideBar() {
		String sql = "SELECT * FROM products ORDER BY id DESC LIMIT 3";
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}
	
=======
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
>>>>>>> 2a4ce94f439ff3b443429d76da920ddc2a6b31a3
}
