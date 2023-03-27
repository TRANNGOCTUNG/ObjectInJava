package tv;

import java.io.PrintStream;
import java.util.Scanner;

public class OnOffTV extends TV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------Tv1---------------------------------");
        System.out.println(" Trạng thái TV1:");
        TV tv = new TV();
        tv.turnOn();
        System.out.println(" Nhập kênh TV1:");
          tv.setChannel(scanner.nextInt());
        System.out.println(" Nhập âm lượng TV1: ");
        tv.setVolumeLevel(scanner.nextInt());
        System.out.println("-------------------------------Tv2---------------------------------");
        System.out.println(" Trạng thái TV2:");
        TV tv2 = new TV();
        tv2.turnOn();
        System.out.println(" Nhập kênh TV2:");
        tv2.setChannel(scanner.nextInt());
        System.out.println(" Nhập âm tượng TV2:");
        tv2.setVolumeLevel(scanner.nextInt());
        System.out.println("--------------------------------Hiển thị kết quả--------------------------------");
        System.out.println("Tv1 chanel is:" + tv.channel + " Volume TV1 is: " + tv.volumeLevel);
        System.out.println("TV2 chanel is: " + tv.channel + " volume TV2 is: " + tv2.volumeLevel);
    }
}
