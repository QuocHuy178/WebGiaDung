package giadung.Service.User;

import org.springframework.stereotype.Service;

<<<<<<< HEAD
import giadung.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage );
=======
import giadung.Entity.PaginatesDto;

@Service
public interface IPaginatesService {
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage);
>>>>>>> 2a4ce94f439ff3b443429d76da920ddc2a6b31a3
}
