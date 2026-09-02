package method;

public class ex05 {
    public static void main(String[] args) {
        System.out.println("변의 길이 합이 20 이하인 직각 삼각형 (a, b, c):");
        for (int a = 1; a <= 20; a++) {
            for (int b = 1; b <= 20; b++) {
                for (int c = 1; c <= 20; c++) {
                    if ((a + b + c <= 20) && (a * a + b * b == c * c) && (a < b)) {
                        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                    }
                }
            }
        }
    }
}
