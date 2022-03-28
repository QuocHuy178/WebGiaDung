package giadung.Service.User;




import org.springframework.stereotype.Service;

import giadung.Dto.ProductsDto;

@Service
public interface IProductService {
	public ProductsDto getProductById(long id);
}
