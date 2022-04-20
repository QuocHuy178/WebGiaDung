package giadung.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Entity.Categories;
import giadung.Entity.Products;
import giadung.Entity.Slides;

@Service
public interface AdminIHomeService {
	@Autowired
	public List<Categories> GetDataCategory();
	public Categories GetCategorytById(int id);

}
