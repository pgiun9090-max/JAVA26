package bank.app.menu;

import javax.security.auth.login.LoginContext;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.Member;
import bank.member.MemberService;

public class StartMenu extends ConsoleMenu {

	public StartMenu(AccountService as, MemberService ms) {
		super(as, ms);
		this.menuList = new String[] {"종료","로그인","회원가입"};
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			int menu = SelectMenu();
			switch (menu) {
			case 1 -> Login();
			case 2 -> join();
			case 0 -> {sayGoodbye(); return;}
			default -> System.out.println("메뉴에 있는 번호를 선택하시오");
			}
			
		}
	}


	private void sayGoodbye() {
		System.out.println("이용해주셔서 감사합니다");
		
	}

	private void Login() {
		System.out.println("::: 로그인 :::");
		String id = input.readString(">> 아이디 : ");
		String password = input.readString(">> 비밀번호 : ");
		
		boolean isOK = ms.login(id, password);
		if (isOK) {
			switch(ms.getLoggedMember().getType()) {
			case Member.ADMIN -> new AdminMenu(as, ms).run();
			case Member.USER -> new BankingMenu(as, ms).run();
			}
		} else {
			System.out.println("로그인을 할 수 없습니다");
		}
	}
	
	private void join() {
		System.out.println("::: 회원가입 :::");
	}
	
}
