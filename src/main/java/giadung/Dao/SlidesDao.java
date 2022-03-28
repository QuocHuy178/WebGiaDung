package giadung.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import giadung.Entity.Slides;
import giadung.Mapper.SlidesMapper;

@Repository				
public class SlidesDao extends BaseDao{
	public List<Slides>GetDataSlide(){
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM slides" ;
		list = _jdbcTemplate.query(sql, new SlidesMapper());
		return list;
	}
}
