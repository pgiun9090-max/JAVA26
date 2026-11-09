package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class AdminMenu extends ConsoleMenu {

	public AdminMenu(AccountService as, MemberService ms) {
		super(as, ms);
		this.menuList = new String[] {"로그아웃","회원관리","계좌관리"};
	}
	@Override
	public void run() {
		System.out.println("::: 관리자 :::");
		while (true) {
			int menu = SelectMenu();
			switch (menu) {
			case 1 -> new ManageMembersMenu(as, ms).run();
			case 2 -> new ManageAccountsMenu(as, ms).run();
			case 0 -> {logout(); return;}
			default -> System.out.println("메뉴에 있는 번호를 선택하시오");
			}
			
		}
	}
	private void logout() {
		System.out.println("로그아웃");
		
	}

}
