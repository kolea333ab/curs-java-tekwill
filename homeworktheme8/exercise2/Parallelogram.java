package homeworktheme8.exercise2;

public class Parallelogram {
    public Parallelogram() {
    }

    public int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }

    public int calculatePerimeter(int sideLength) {
        return 4 * sideLength;
    }

    public double calculateArea(int length, double width) {
        return (double)length * width;
    }

    public int calculateArea(int sideLength) {
        return sideLength * sideLength;
    }
}
