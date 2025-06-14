package homeworktheme8.exercise3.ThreeD;

public class ThreeDSphere extends ThreeD {
    private double radius;

    public ThreeDSphere(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 12.566370614359172 * this.radius * this.radius;
    }

    public double getVolume() {
        return 4.1887902047863905 * Math.pow(this.radius, (double)3.0F);
    }
}