package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class ManageMembersMenu extends ConsoleMenu{

	public ManageMembersMenu(AccountService as, MemberService ms) {
		super(as, ms);
		this.menuList = new String[] {"돌아가기", "회원목록", "회원강퇴"};
	}

	@Override
	public void run() {
		System.out.println("::: 회원관리 :::");
		while (true) {
			int menu = SelectMenu();
			switch (menu) {
			case 1 -> ListMembers();
			case 2 -> DeleteMember();
			case 0 -> {GoBack(); return;}
			default -> System.out.println("메뉴에 있는 번호를 선택하시오");
			}
			
		}
		
	}

	private void DeleteMember() {
		System.out.println("회원강퇴");
	}

	private void ListMembers() {
		System.out.println("회원목록");
	}

	private void GoBack() {
		System.out.println("돌아가기");
	}

}
