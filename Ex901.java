class CRectangle {
    int width; 
    int height; 

    // 有引數的建構元
    public CRectangle(int w, int h) {
        width = w; 
        height = h; 
    }

    // 沒有引數的建構元，使用this()設定width和height
    public CRectangle() {
        this(10, 8);
    }
}

public class Ex901 {
    public static void main(String[] args) {       
        CRectangle rect = new CRectangle(); // 建立CRectangle物件
        System.out.println(rect.width); 
        System.out.println(rect.height); 
    }
}