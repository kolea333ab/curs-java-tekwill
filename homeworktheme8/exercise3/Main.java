package homeworktheme8.exercise3;

import homeworktheme8.exercise3.ThreeD.ThreeD;
import homeworktheme8.exercise3.ThreeD.ThreeDCube;
import homeworktheme8.exercise3.ThreeD.ThreeDSphere;
import homeworktheme8.exercise3.TwoD.TwoD;
import homeworktheme8.exercise3.TwoD.TwoDCircle;
import homeworktheme8.exercise3.TwoD.TwoDRectangle;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        TwoD circle = new TwoDCircle((double)5.0F);
        TwoD rectangle = new TwoDRectangle((double)4.0F, (double)6.0F);
        ThreeD sphere = new ThreeDSphere((double)3.0F);
        ThreeD cube = new ThreeDCube((double)2.0F);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Sphere area: " + sphere.getArea());
        System.out.println("Sphere volume: " + sphere.getVolume());
        System.out.println("Cube area: " + cube.getArea());
        System.out.println("Cube volume: " + cube.getVolume());
    }
}
