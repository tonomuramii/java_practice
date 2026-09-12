public class debugtest {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int result = add(a, b);

        System.out.println("計算結果：" + result);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}