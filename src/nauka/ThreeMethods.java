package nauka;

public class ThreeMethods {
    public static void main(String[] args) {
        int x = getNumber();
        String y = getText();
        Boolean z = getBoolean();

        System.out.println("zwrocona wartosc to " + getNumber());
        System.out.println("zwrocona wartosc to " + getText());
        System.out.println("zwrocona wartosc to " + getBoolean());
    }

    public static int getNumber() {
        System.out.println(">>bede zwracać wartosc 5<<<");
        return 5;
    }

    public static String getText() {
        System.out.println(">>bede zwracac wartosc piec<<<");
        return "piec";
    }

    public static boolean getBoolean() {
        System.out.println(">>bede zwracac wartosc true<<<");
        return true;
    }
}