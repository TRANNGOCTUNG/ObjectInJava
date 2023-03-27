package quadraticEquations;

public class QuadraticEquation {
    private float a;
    private float b;
    private float c;
    private float delta = b*b - 4*a*c;
    private float x1;
    private float x2;

    public QuadraticEquation() {
    }

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if( a == 0 ) {
            if( b == 0 ){
                System.out.println("Phương trình vô nghiêm:");
            } else {
                System.out.println("Phương trình có nghiệm: " + " x= " + (-c/b));
            }
        }
        if( delta > 0 ) {
            x1 = (float) getRoot1();
            x2 = (float) getRoot2();
            System.out.println("Phương trình có 2 ngiệm: " + " x1 =" + x1 + " x2 = " + x2);
        } else if(delta == 0) {
            x1 = (float) getDiscriminant();
            System.out.println("Phương trình có nghiệm kép: " + " x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return Math.pow(b,2) - 4*a*c;
    }
    public double getRoot1(){
        return (-b + Math.sqrt(delta)) / 2*a;
    }
    public double getRoot2(){
        return (-b - Math.sqrt(delta)) / 2 * a;
    }
    public void displays(){
        System.out.printf("%4s %9s %12s \n",getA(),getB(),getC(),new QuadraticEquation(a,b,c));
    }

}
