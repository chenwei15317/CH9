class CCount {
    private static int cnt = 0; // 類別變數，用來追蹤物件建立的個數

    public CCount() {
        cnt++; // 在建立物件時，cnt的值加1
    }

    public static void setZero() {
        cnt = 0; // 歸零cnt的值，使用類別變數
    }
    public void setValue(int n) {
        cnt = n; // 設定cnt的值為n，使用實例函數
    }

    public static int getCount() {
        return cnt; // 取得cnt的值，使用類別函數
    }
}
public class Ex905 {
    public static void main(String[] args) {
        CCount obj1 = new CCount();

        System.out.println("目前 cnt 的值: " + CCount.getCount()); // 輸出 2

        CCount.setZero(); // 歸零 cnt 的值，使用類別函數

        System.out.println("目前 cnt 的值: " + CCount.getCount()); // 輸出 0

        obj1.setValue(5); // 不正確的操作，使用實例函數設定 cnt 的值
        System.out.println("目前 cnt 的值: " + CCount.getCount()); // 輸出 5
    }
}    