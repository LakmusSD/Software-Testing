
import shapes.Triangle;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Triangle a = Triangle.createTriangle();
        System.out.println(a.area());
        System.out.println(a.isRectangular());
        System.out.println(a.isIsosceles());
        System.out.println(a.isArbitrary());
    }
}
