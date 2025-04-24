package homeworktheme8.exercise3.ThreeD;

public class ThreeDSphere extends ThreeD {
    private double radius;

    public ThreeDSphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}