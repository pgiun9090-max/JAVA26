package bank.member;

import java.util.List;

public interface MemberService {
	boolean join(String id, String password, String name);
	boolean login(String id, String password);
	Member getLoggedMember();
	boolean logout();
	
	List<Member> getAllMembers();
	Member getMemberInfo(String id);
	
	boolean changePassword(String id, String curPassword, String newPassword);
	boolean addMemberInfo(String id, String email, String mobile);
	
	boolean withdrawMembership(String id, String password);
}
