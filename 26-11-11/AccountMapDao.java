package bank.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountMapDao implements AccountDao {
	
	Map<Integer, Account> accountDB = new HashMap<Integer, Account>();
	@Override
	public boolean save(Account a) {
		accountDB.put(a.getNo(), a);
		return true;
	}

	@Override
	public List<Account> findAll() {
		if(accountDB.isEmpty()) {
			return null;
		}
		List<Account> alist = new ArrayList<>();
		for(Account a: accountDB.values()) {
			alist.add(a);
		}
		return alist;
	}

	@Override
	public Account findByNo(int no) {
		return accountDB.get(no);
	}


	@Override
	public boolean update(Account a) {
		accountDB.put(a.getNo(), a);
		return true;
	}

	@Override
	public boolean delete(Account a) {
		accountDB.remove(a.getNo());
		return true;
	}

}
