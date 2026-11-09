package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class MyInfoMenu extends ConsoleMenu{

	public MyInfoMenu(AccountService as, MemberService ms) {
		super(as, ms);
		this.menuList = new String[] {"돌아가기","비밀번호수정","회원탈퇴"};
	}

	@Override
	public void run() {
		System.out.println("::: 뱅킹메뉴 :::");
		while (true) {
			int menu = SelectMenu();
			switch (menu) {
			case 1 -> UpdatePassword();
			case 2 -> DeleteMembership();
			case 0 -> {GoBack(); return;}
			default -> System.out.println("메뉴에 있는 번호를 선택하시오");
			}
			
		}
	}

	private void GoBack() {
		System.out.println("돌아가기");
	}

	private void UpdatePassword() {
		System.out.println("비밀번호수정");
	}

	private void DeleteMembership() {
		System.out.println("회원탈퇴");
	}

}
