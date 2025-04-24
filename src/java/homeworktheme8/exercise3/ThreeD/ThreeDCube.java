package homeworktheme8.exercise3.ThreeD;

public class ThreeDCube extends ThreeD {
    private double side;

    public ThreeDCube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}