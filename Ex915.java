class CRational {
    public int n;
    public int d;

    public void setN(int num) {
        n = num;
    }

    public void setD(int den) {
        d = den;
    }

    public void setND(int num, int den) {
        n = num;
        d = den;
    }

    public void show() {
        System.out.println(n + "/" + d);
    }

    public boolean larger(CRational r) {
        // 計算兩個有理數的十進制值
        double value1 = (double)n / d;
        double value2 = (double)r.n / r.d;

        // 比較兩個值
        return value1 > value2;
    }
}

public class Ex915 {
    public static void main(String[] args) {
        CRational aaa = new CRational();
        aaa.setND(2, 5);

        CRational bbb = new CRational();
        bbb.setND(3, 7);

        boolean result = aaa.larger(bbb);
        System.out.println("Is aaa larger than bbb? " + result); // 印出結果
    }
}
