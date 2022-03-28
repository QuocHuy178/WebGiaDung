package giadung.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import giadung.Entity.Products;

public class ProductsMapper implements RowMapper<Products> {

	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Products products = new Products();
		products.setId(rs.getLong("id"));
		products.setId_Category(rs.getInt("id_category"));
		products.setName(rs.getString("name"));
		products.setPrice(rs.getDouble("price"));
		products.setImage(rs.getString("image"));
		products.setDescription(rs.getString("description"));
		products.setHot_product(rs.getBoolean("hot_product"));
		products.setNew_product(rs.getBoolean("new_product"));
		products.setCreate_date(rs.getDate("create_date"));
		products.setUpdate_date(rs.getDate("update_date"));
		return products;
	}

}
