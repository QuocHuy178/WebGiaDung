package giadung.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategories implements RowMapper<Categories> {

	public Categories mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Categories categories = new Categories();
		categories.setId(rs.getInt("id"));
		categories.setName(rs.getString("name"));

		return categories;
	}

}