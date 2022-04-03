package methods;

public class MyFirstReturn {
    public static void main(String[] args) {
        int x = getNumber();
        System.out.println("dostalem wartosc " + x);
        System.out.println("zwrocona wartosc to " + getNumber());
    }

    public static int getNumber() {
        System.out.println(">>bede zwracac wartosc 5<<<");
        return 5;
    }
}
