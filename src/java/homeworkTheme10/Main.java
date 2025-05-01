package homeworkTheme10;

class Polygon{
    public void render(){
        System.out.println("Rendering a polygon");
    }
}
class Square extends Polygon{
    @Override
    public void render() {
        System.out.println("Rendering a square");
    }
}

class Circle extends Polygon{
    @Override
    public void render() {
       System.out.println("Rendering a circle");
    }
}

public class Main {
    public static void main (String[] args){
        Square square1 = new Square();
        Circle circle1 = new Circle();
        Polygon square2 = new Square();
        Polygon circle2 = new Circle();

        square1.render();
        circle1.render();
        square2.render();
        circle2.render();
    }
}
