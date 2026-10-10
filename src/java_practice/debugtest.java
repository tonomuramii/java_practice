package java_practice;

//パケージを宣言

//マージテスト

public class debugtest {

    public static void main(String[] args) {

        int a = 10;
        int b = 30;
        int c = 40;
        
        

        int result = add(a, b);

        System.out.println("計算結果：" + result);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}