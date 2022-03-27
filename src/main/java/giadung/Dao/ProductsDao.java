package giadung.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import giadung.Dto.ProductsDto;
import giadung.Dto.ProductsDtoMapper;
@Repository
public class ProductsDao extends BaseDao {
	public List<ProductsDto> getDataProductsHot() {
		String sql ="SELECT * FROM products WHERE hot_product = 1 ORDER BY id DESC LIMIT 4";
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
				return listProducts;
	}
	public List<ProductsDto> getDataProductsHotLast() {
		String sql ="SELECT * FROM products WHERE hot_product = 1 ORDER BY id ASC LIMIT 4";
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
				return listProducts;
	}
	
	public List<ProductsDto> getDataProductsNew() {
		String sql ="SELECT * FROM products WHERE new_product = 1 ORDER BY id DESC LIMIT 6";
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
				return listProducts;
	}
	
	public List<ProductsDto> getDataProductsSideBar() {
		String sql ="SELECT * FROM products WHERE new_product = 1 ORDER BY id DESC LIMIT 3";
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
				return listProducts;
	}
	
//	public List<ProductsDto> getDataAllProductsById(int id) {
//		String sql = "SELECT * FROM `product` WHERE FIND_IN_SET('$id', `id_category`)";
//		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
//				return listProducts;
//	}
}
 