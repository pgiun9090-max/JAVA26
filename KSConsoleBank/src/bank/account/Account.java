package bank.account;

public class Account {
    private int no;
    private String password;
    private String memberId;
    private int balance;

    public Account(int no, String password, String memberId, int balance) {
        this.no = no;
        this.password = password;
        this.memberId = memberId;
        this.balance = balance;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberid(String memberId) {
        this.memberId = memberId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "[" + no + ", " + password + ", " + memberId + ", " + balance + "]";
    }



}
