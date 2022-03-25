package giadung.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.CategoryDao;
import giadung.Dao.SlidesDao;
import giadung.Entity.Categories;
import giadung.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao;
	{

	}
	@Autowired
	private CategoryDao categoryDao;
	{

	}

	public List<Slides> GetDataSlide() {
		// TODO Auto-generated method stub
		return slidesDao.GetDataSlide();
	}

	@Override
	public List<Categories> getDataCategories() {
		// TODO Auto-generated method stub
		return categoryDao.getDataCategories();
	}

}
