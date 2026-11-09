package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class BankingMenu extends ConsoleMenu {

	public BankingMenu(AccountService as, MemberService ms) {
		super(as, ms);
		this.menuList = new String[] {"로그아웃","계좌목록","입금","출금","계좌생성","계좌해지","내정보"};
	}
	@Override
	public void run() {
		System.out.println("::: 뱅킹메뉴 :::");
		while (true) {
			int menu = SelectMenu();
			switch (menu) {
			case 1 -> ListMyAccounts();
			case 2 -> Deposit();
			case 3 -> Withdraw();
			case 4 -> CreateAccount();
			case 5 -> DeleteAccount();
			case 6 -> new MyInfoMenu(as, ms).run();
			case 0 -> {logout(); return;}
			default -> System.out.println("메뉴에 있는 번호를 선택하시오");
			}
			
		}
	}
	private void logout() {
		System.out.println("로그아웃");
	}
	private void ListMyAccounts() {
		System.out.println("계좌목록");
	}
	private void Deposit() {
		System.out.println("입금");
	}
	private void Withdraw() {
		System.out.println("출금");
	}
	private void CreateAccount() {
		System.out.println("계좌생성");
	}
	private void DeleteAccount() {
		System.out.println("계좌해지");
	}


}