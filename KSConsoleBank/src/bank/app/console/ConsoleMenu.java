package bank.app.console;

import java.util.List;

import bank.account.Account;
import bank.account.AccountService;
import bank.member.Member;
import bank.member.MemberService;

public abstract class ConsoleMenu {
	protected AccountService as;
	protected MemberService ms;
	protected String[] menuList;
	protected ScannerInput input = new ScannerInput();
	
	protected ConsoleMenu(AccountService as, MemberService ms) {
		this.as = as;
		this.ms = ms;
	}
	
	public abstract void run();
	
	protected int SelectMenu() {
		System.out.println("----------------------------");
		for(int i = 1; i < menuList.length; i++)
			System.out.println(i + ". " + menuList[i]);
		System.out.println("0. " + menuList[0]);
		System.out.println("----------------------------");
		int menu = input.readInt("> 메뉴번호 : ");
		return menu;
	}
	protected void printMemberList(List<Member> members) {
		if(members == null || members.isEmpty())
			System.out.println("회원이 없습니다");
		else {
			for (Member m : members) {
				System.out.println(m);
			}
		}
	}
	private void printAccountrList(List<Account> accounts) {
		if(accounts == null || accounts.isEmpty())
			System.out.println("계좌가 없습니다");
		else {
			for (Account account : accounts)
				System.out.println(account);
		}
	}
}
