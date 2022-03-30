package giadung.Service.User;

import org.springframework.stereotype.Service;

import giadung.Entity.PaginatesDto;

@Service
public class PaginatesServiceImpl implements IPaginatesService {

	@Override
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage) {
		// TODO Auto-generated method stub
		PaginatesDto paginates = new PaginatesDto();

		paginates.setLimit(limit);
		paginates.setTotalPage(SetInfoTotalPage(totalData, limit));
		paginates.setCurrentPage(CheckCurrentPage(currentPage, paginates.getTotalPage()));
		
		paginates.setStart(FindStart(paginates.getCurrentPage(), limit));
		paginates.setEnd(FindEnd(paginates.getStart(), limit, totalData));

		return paginates;
	}

	private int FindStart(int currentPage, int limit) {
		// TODO Auto-generated method stub
		int start = ((currentPage - 1) * limit) + 1;
		
		return start < 0 ? 1 : start;
	}

	private int FindEnd(int start, int limit, int totalData) {
		// TODO Auto-generated method stub

		return start + limit > totalData ? totalData : (start + limit) - 1;
	}

	private int SetInfoTotalPage(int totalData, int limit) {
		// TODO Auto-generated method stub
		int totalPage = 0;
		totalPage = totalData / limit;

		return totalPage * limit < totalData ? totalPage + 1 : totalPage;
	}

	public int CheckCurrentPage(int currentPage, int totalPage) {
		if (currentPage < 1) {
			return 1;
		}
		if (currentPage > totalPage) {
			return totalPage;
		}

		return currentPage;
	}
}
