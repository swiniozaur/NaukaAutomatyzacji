package nauka;

public class CustomMethods {
    public static void main(String[] args) {
        printHello();
        printBye();
    }

    public static void printHello() {
        System.out.println("Moja nazwa to printHello");
        printBye();
    }

    public static void printBye() {
        System.out.println("Moja nazwa to print Bye");
    }
}