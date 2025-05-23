package homeworktheme8.exercise3.TwoD;

public class TwoDRectangle extends TwoD {
    private double width;
    private double height;

    public TwoDRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}