package homeworktheme8.exercise3;

import homeworktheme8.exercise3.ThreeD.ThreeD;
import homeworktheme8.exercise3.ThreeD.ThreeDCube;
import homeworktheme8.exercise3.ThreeD.ThreeDSphere;
import homeworktheme8.exercise3.TwoD.TwoD;
import homeworktheme8.exercise3.TwoD.TwoDCircle;
import homeworktheme8.exercise3.TwoD.TwoDRectangle;

public class Main {
    public static void main(String[] args) {
        // 2D
        TwoD circle = new TwoDCircle(5);
        TwoD rectangle = new TwoDRectangle(4, 6);

        // 3D
        ThreeD sphere = new ThreeDSphere(3);
        ThreeD cube = new ThreeDCube(2);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());

        System.out.println("Sphere area: " + sphere.getArea());
        System.out.println("Sphere volume: " + sphere.getVolume());

        System.out.println("Cube area: " + cube.getArea());
        System.out.println("Cube volume: " + cube.getVolume());
    }
}