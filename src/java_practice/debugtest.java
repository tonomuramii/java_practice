package java_practice;

//パケージを宣言

//マージテスト

public class debugtest {

    public static void main(String[] args) {

        int a = 10;
        int b = 30;
        int c = 100;
        //スタック機能確認中
        int result2 = add(a,c);
        //コミット内容に取り消し
        //競合なしのマージ
        //マージの競合を修正

        

        int result = add(a, b);

        System.out.println("計算結果：" + result);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}