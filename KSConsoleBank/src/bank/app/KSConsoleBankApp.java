package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.KSAccountService;
import bank.app.menu.StartMenu;
import bank.member.MemberOracleDao;
import bank.member.MemberService;
import bank.member.KSMemberService;

public class KSConsoleBankApp {

    public static void main(String[] args) {
        MemberService ms =
                new KSMemberService(new MemberOracleDao());

        AccountService as =
                new KSAccountService(new AccountListDao());

        new StartMenu(as, ms).run();
    }
}