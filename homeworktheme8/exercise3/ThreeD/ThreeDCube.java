package homeworktheme8.exercise3.ThreeD;

public class ThreeDCube extends ThreeD {
    private double side;

    public ThreeDCube(double side) {
        this.side = side;
    }

    public double getArea() {
        return (double)6.0F * this.side * this.side;
    }

    public double getVolume() {
        return Math.pow(this.side, (double)3.0F);
    }
}

