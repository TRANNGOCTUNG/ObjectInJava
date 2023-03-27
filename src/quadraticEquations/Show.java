package quadraticEquations;

import java.util.Scanner;

public class Show {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        System.out.println(" Nhập hệ số bậc 2 a =");
        quadraticEquation.setA(scanner.nextFloat());
        System.out.println(" Nhập hệ số bậc 1 b = ");
        quadraticEquation.setB(scanner.nextFloat());
        System.out.println(" Nhập hệ số tự do c =");
        quadraticEquation.setC(scanner.nextFloat());
        System.out.printf("%5s %10s %12s\n","Cạnh A","Cạnh B","Cạnh C");
        quadraticEquation.displays();
    }
}
