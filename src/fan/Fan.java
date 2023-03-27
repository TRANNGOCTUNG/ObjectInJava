package fan;

import java.util.Scanner;

public class Fan {
     int speed;
     boolean on;
     boolean off;
     double radius;
     final int slow = 1, medium = 2, fast = 3;
     static Scanner scanner = new Scanner(System.in);
     String color;

    public Fan() {
        speed = 1;
        radius = 5;
        on = false;
        color = "blue";
    }

    public Fan(int speed, boolean on, boolean off, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.off = off;
        this.radius = radius;
        this.color = color;
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff() {
        on = false;
    }

    public void setSpeed(int newSpeed) {
                if (on && newSpeed > 0 || on && newSpeed <= 3) {
                    if (newSpeed <= 1) {
                        System.out.println("Slow: ");
                    } else if (newSpeed == 2) {
                        System.out.println("Medium: ");
                    } else if (newSpeed == 3) {
                        System.out.println("Fast: ");
                    } else {
                        System.out.println("Số trên không có");
                    }
                }
                speed = newSpeed;
            }
    public void setRadius(double newRadius) {
        if(on && newRadius > 0 || on && newRadius <=5 ){
            System.out.println(newRadius);
        } else {
            System.out.println("Bán kính koo đạt: ");
        }
        radius = newRadius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void speedUp(){
        if(on && speed < 1){
            speed++;
        }
    }
    public void speedDown(){
        if(on && speed > 3){
            speed--;
        }
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", off=" + off +
                ", radius=" + radius +
                ", slow=" + slow +
                ", medium=" + medium +
                ", fast=" + fast +
                ", color='" + color + '\'' +
                '}';
    }


}
