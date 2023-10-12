public class Ex916 {
    // 外部類別

    public static class CRational {
        // 內部類別

        public int n; // 分子
        public int d; // 分母

        // 設定分子的方法
        public void setN(int num) {
            n = num;
        }

        // 設定分母的方法
        public void setD(int den) {
            d = den;
        }

        // 同時設定分子和分母的方法
        public void setND(int num, int den) {
            n = num;
            d = den;
        }

        // 顯示有理數的分數形式
        public void show() {
            System.out.println(n + "/" + d);
        }

        // 比較兩個有理數的大小
        public boolean larger(CRational r) {
            // 計算兩個有理數的十進制值
            double value1 = (double) n / d;
            double value2 = (double) r.n / r.d;

            // 比較兩個值
            return value1 > value2;
        }

        // 計算有理數的面積或其他計算
        public double computeArea() {
            return (double) n / d;
        }
    }

    public static void main(String[] args) {
        CRational[] cir = new CRational[6];

        // 使用 for 迴圈設定 CRational 物件
        for (int i = 0; i < 6; i++) {
            cir[i] = new CRational();
            cir[i].setND(i, i + 1); // 設定分子和分母
        }

        // 列印輸入結果和每個物件的面積
        for (int i = 0; i < 6; i++) {
            System.out.print("cir[" + i + "] 的值：");
            cir[i].show(); // 顯示有理數值
            System.out.println("cir[" + i + "] 的面積：" + cir[i].computeArea()); // 顯示面積
        }
    }
}
