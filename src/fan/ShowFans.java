package fan;

import java.util.Scanner;

public class ShowFans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------Trạng thái quạt 1-------------------------------");
        System.out.println("Trạng thái quạt 1:");
        Fan fan = new Fan();
        fan.turnOn();
        System.out.println("Tốc độ quạt:");
        fan.setSpeed(scanner.nextInt());
        System.out.println("Màu sắc của quạt: ");
        fan.setColor(scanner.next());
        System.out.println("Bán kính của quạt: ");
        fan.setRadius(scanner.nextInt());
        System.out.println("----------------------------------Trạng thái quạt 2------------------------------");
        System.out.println("Trạng thái quạt 2");
        Fan fan2 = new Fan();
        fan2.turnOff();
        System.out.println("Tốc độ quạt:");
        fan2.setSpeed(scanner.nextInt());
        System.out.println("Màu sắc quạt: ");
        fan2.setColor(scanner.next());
        System.out.println("Bán kính của quạt: ");
        fan2.setRadius(scanner.nextInt());
        System.out.println("-----------------------------------Trạng thái 2 quạt------------");
        System.out.println("Quạt số 1:" + " Trạng thái quạt: " + fan.on + " ,đang bật số: " + fan.speed + " ,màu sắc quạt: " + fan.color + " ,bán kính quạt: " + fan.radius);
        System.out.println("Quạt số 2 :" + " Trạng thái quạt: " + fan2.off + " ,đang bật số: "+ fan2.speed + " ,màu sắc quạt: " + fan2.color + " ,bán kính quạt: " + fan2.radius);
        System.out.println(fan);

    }
}
