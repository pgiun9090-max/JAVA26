package bank.member;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MemberListDao implements MemberDao {

	//List<Member> memberDB = new ArrayList<>();
	List<Member> memberDB = new LinkedList<>();
	
	@Override
	public boolean save(Member m) {
		return memberDB.add(m);
	}

	@Override
	public List<Member> findAll() {
		if (memberDB.size() == 0) { 
			return null; //멤버가 없으면 null
		}
		
		List<Member> members = new ArrayList<>();
		for (Member m : memberDB) {
			members.add(m);
		}
		return members;
	}

	@Override
	public Member findById(String id) {
		for (Member m : memberDB) {
			if(m.getId().equals(id)) {
				return m;
			}
		}
		return null; //같은 아이디가 없으면 for문 다 돌고 null
	}

	@Override
	public boolean update(Member m) {
		Member target = findById(m.getId());
		if (target == null){
			return false;
		}
//		memberDB.remove(target);
//		memberDB.add(m);
		
		int index = memberDB.indexOf(target);
		memberDB.set(index, m);
		
		return true;
	}

	@Override
	public boolean delete(Member m) {
		Member target = findById(m.getId());
		if (target == null){
			return false;
		}
		return memberDB.remove(target);
	}

}
