package gemotricRectangle;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        width = 4;
        height = 5;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea(){
        return width * height;
    }
    public int getPerimeter(){
        return (width * height) * 2;
    }
    public void display(){
        System.out.printf("%6d  %10s %14s %19s\n",getWidth(),getHeight(),getArea(),getPerimeter());
    }
    public String display1(){
        return "Rectangle{" + " width " + width + " height " + height + "}";
    }
}
