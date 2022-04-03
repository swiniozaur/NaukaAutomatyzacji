package nauka;

public class parameters {
    public static void main(String[] args) {
        printIfNumberIsEven(10);
        printIfNumberIsEven(20);
        printIfNumberIsEven(15);
        printIfNumberIsEven(17);
    }

    public static void printIfNumberIsEven(int number) {
        System.out.println("Sprawdzam liczbe " + number);
        if (number % 2 == 0) {

            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
