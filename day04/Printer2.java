package ExemPrinter;

class Printer2 {
    private int numOfPapers;
    private boolean duplex;

    public Printer2(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    public void print(int amount) {
        if (numOfPapers == 0) {
            System.out.println("용지가 없습니다.");
            return;
        }

        int requiredPapers = duplex ? (amount / 2 + amount % 2) : amount;
        String mode = duplex ? "양면으로" : "단면으로";

        if (requiredPapers <= numOfPapers) {
            numOfPapers -= requiredPapers;
            System.out.println(mode + " " + requiredPapers + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
        } else {
            int shortage = requiredPapers - numOfPapers;
            System.out.println(mode + " 모두 출력하려면 용지가 " + shortage + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
            numOfPapers = 0;
        }
    }

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
