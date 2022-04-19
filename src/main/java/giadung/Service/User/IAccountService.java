package giadung.Service.User;

import giadung.Entity.Users;

public interface IAccountService {
	public int AddAccount(Users user);
	public Users CheckAccount(Users user);
}
