package homeworktheme8.exercise2;

public class Main {
    public static void main(String[] args) {
        Parallelogram p = new Parallelogram();

        System.out.println("Perimeter (15 x 10): " + p.calculatePerimeter(10, 10));
        System.out.println("Perimeter (square 7): " + p.calculatePerimeter(7));

        System.out.println("Area (15 x 3.5): " + p.calculateArea(15, 3.5));
        System.out.println("Area (square 4): " + p.calculateArea(4));
    }
}

