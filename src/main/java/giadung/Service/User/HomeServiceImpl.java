package giadung.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.SlidesDao;
import giadung.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao; {
		
	}
	
	public List<Slides> GetDataSlide() {
		// TODO Auto-generated method stub
		
		return slidesDao.GetDataSlide();
	}

}
