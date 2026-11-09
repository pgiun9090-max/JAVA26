package test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberOracleDao;
import bank.member.MemberService;
import bank.member.KSMemberService;

public class TestMember {

    public static void main(String[] args) {
        // testMemberDao();
        testMemberService();
    }

    public static void testMemberService() {
        MemberService ms = new KSMemberService(new MemberOracleDao());

        System.out.println(">> 회원가입 목록 조회");
        ms.join("curi", "1234", "큐리");
        ms.join("curi2", "11111234", "큐리2");
        printMemberList(ms.getAllMembers());

        System.out.println(">> 로그인, 로그아웃");
        if (ms.login("curi", "1234"))
            System.out.println(ms.getLoggedMember());

        ms.logout();
        System.out.println(ms.getLoggedMember());

        System.out.println(">> 회원 정보 보기");
        ms.login("admin", "1234");
        System.out.println(ms.getMemberInfo("curi"));

        System.out.println(">> 비밀번호 변경");
        ms.changePassword("curi", "1234", "cccc");
        printMemberList(ms.getAllMembers());
    }

    public static void testMemberDao() {
        MemberDao mdao = new MemberOracleDao();

        // 회원 추가
        System.out.println(">> 회원 추가 및 회원 목록");

        mdao.save(new Member(
                "hong", "1111", "홍길동", null, null, Member.USER
        ));
        mdao.save(new Member(
                "curi", "1111", "큐리", null, null, Member.USER
        ));

        printMemberList(mdao.findAll());

        // 회원 모두 찾기
        System.out.println(">> 회원 목록");
        List<Member> mlist = mdao.findAll();

        // 회원 출력
        printMemberList(mlist);

        System.out.println(">> 아이디로 회원 찾기");
        Member m = mdao.findById("curi");
        System.out.println(m);

        System.out.println(">> 비번 변경");
        m.setPassword("1234");
        mdao.update(m);
        printMemberList(mdao.findAll());

        System.out.println(">> 회원 삭제");
        mdao.delete(mdao.findById("curi"));
        printMemberList(mdao.findAll());
    }

    public static void printMemberList(List<Member> mlist) {
        for (Member m : mlist) {
            System.out.println(m);
        }
    }
}