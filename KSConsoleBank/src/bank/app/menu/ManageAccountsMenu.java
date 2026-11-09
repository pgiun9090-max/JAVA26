package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class ManageAccountsMenu extends ConsoleMenu{

	public ManageAccountsMenu(AccountService as, MemberService ms) {
		super(as, ms);
		this.menuList = new String[] {"돌아가기","전체계좌목록","회원별계좌목록"};
	}

	@Override
	public void run() {
		System.out.println("::: 계좌관리 :::");
		while (true) {
			int menu = SelectMenu();
			switch (menu) {
			case 1 -> ListAllAccounts();
			case 2 -> ListMemberAccounts();
			case 0 -> {GoBack(); return;}
			default -> System.out.println("메뉴에 있는 번호를 선택하시오");
			}
			
		}
	}

	private void GoBack() {
		System.out.println("돌아가기");
	}

	private void ListAllAccounts() {
		System.out.println("전체계좌목록");
	}

	private void ListMemberAccounts() {
		System.out.println("회원별계좌목록");
	}

}
