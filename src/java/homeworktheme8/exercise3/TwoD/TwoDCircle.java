package homeworktheme8.exercise3.TwoD;

public class TwoDCircle extends TwoD {
    private double radius;

    public TwoDCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

