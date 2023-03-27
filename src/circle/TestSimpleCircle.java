package circle;

import java.util.Objects;
import java.util.Scanner;

public class TestSimpleCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Diện tích hình tròn: ");
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle: " + circle1.getArea() + " --- " + circle1.getPerimeter());
        SimpleCircle circle2 = new SimpleCircle();
        System.out.println("Nhập bán kính:");
        circle2.setRadius(scanner.nextDouble());
        System.out.println(" The area of the circle:" + circle2.getArea() + " --- " + circle1.getPerimeter());
        SimpleCircle circle3 = new SimpleCircle(25);
        System.out.println(" The area of the circle: " + circle3.getArea() + " --- "+ circle1.getPerimeter());
    }
}
