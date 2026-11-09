package bank.member;

import java.lang.System.Logger;
import java.util.List;

//이 서비스는 이강석이 구현했습니다.
public class KSMemberService implements MemberService{
	
	final String ADMIN_ID = "admin";
	final String ADMIN_PWD = "1234";
	
	private MemberDao dao;
	private Member loggedMember;

	public KSMemberService(MemberDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean join(String id, String password, String name) {
		if (dao.findById(id) != null) return false;
		
		
		return dao.save(new Member(id, password, name, null, null, Member.USER));
	}

	@Override
	public boolean login(String id, String password) {
		
		Member m = dao.findById(id);
		if (m != null && m.getPassword().equals(password)) {
			loggedMember = m;
			return true;
		}
		return false;
	}
	

	@Override
	public Member getLoggedMember() {
		return loggedMember;
	}

	@Override
	public boolean logout() {
		loggedMember = null;
		return true;
	}

	@Override
	public List<Member> getAllMembers() {
		
		List<Member> mlist = dao.findAll();
		//관리자를 제외한 목록 반환
		mlist.removeIf(member -> member.getType() == Member.ADMIN);		
		if (mlist.isEmpty()) return null;
		return mlist;
	}

	@Override
	public Member getMemberInfo(String id) {
		if (loggedMember != null) {
			// 로그인 회원정보만 볼 수 있게 하기
			 if (loggedMember.getId().equals(id))
				 return dao.findById(id);
			//관리자만 볼 수 있게 하기
			 if (loggedMember.getType() == Member.ADMIN)
				 return dao.findById(id);
			 return null;
		}
		return null;
	}

	@Override
    public boolean changePassword(String id, String curPassword, String newPassword) {

        // 로그인한 회원의 비밀번호만 바꿀 수 있도록 조건 체크
        if (loggedMember == null) return false;
        Member m = dao.findById(id);

        // 관리자인 경우 무조건 비밀번호 변경
        if (m != null && loggedMember.getType() == Member.ADMIN) {
            m.setPassword(newPassword);
            return dao.update(m);
        }

        // 로그인한 사용자이면 현재 비밀번호 비교
        if (m != null && loggedMember.getId().equals(id)) {
            if (m.getPassword().equals(curPassword)) {
                m.setPassword(newPassword);
                return dao.update(m);
            }
        }

        return false;
    }
	
	@Override
	public boolean addMemberInfo(String id, String email, String mobile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdrawMembership(String id, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
