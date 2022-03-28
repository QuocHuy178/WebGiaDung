package giadung.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.ProductsDao;
import giadung.Dto.ProductsDto;
@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	ProductsDao productDao = new ProductsDao();
	
	public ProductsDto getProductById(long id) {
	  List<ProductsDto> listProducts = productDao.getProductById(id);
		return listProducts.get(0);
	}

}
