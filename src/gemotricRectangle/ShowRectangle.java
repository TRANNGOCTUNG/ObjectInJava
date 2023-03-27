package gemotricRectangle;

import java.util.Scanner;

public class ShowRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Nhap chiều rộng:");
        rectangle.setWidth(scanner.nextInt());
        System.out.println("Nhập chiều cao:");
        rectangle.setHeight(scanner.nextInt());
        System.out.printf("%6s %10s %10s %10s\n"," Chiều rộng "," Chiều cao", " Chu vi chữ nhật "," Diện tích chữ nhật");
        rectangle.display();
        rectangle.display1();


    }
}