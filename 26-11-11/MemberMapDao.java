package bank.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberMapDao implements MemberDao{

	Map<String, Member> memberDB = new HashMap<String, Member>();
	@Override
	public boolean save(Member m) {
		memberDB.put(m.getId(), m);
		return true;
	}

	@Override
	public List<Member> findAll() {
		
		if(memberDB.isEmpty()) {
			return null; // 회원이 없으면 null (MemberListDao와 같은 방식)
		}
		List<Member> mlist = new ArrayList<>();
		for(Member m : memberDB.values()) {
			mlist.add(m);
		}
		return mlist;
	}

	@Override
	public Member findById(String id) {
		return memberDB.get(id);
	}

	@Override
	public boolean update(Member m) {
		memberDB.put(m.getId(), m);
		return true;
		
		//return save(m);
	}

	@Override
	public boolean delete(Member m) {
		memberDB.remove(m.getId());
		return true;
	}

}
