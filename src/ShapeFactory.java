import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap();
    private static final HashMap<String, Shape> squareMap = new HashMap();
    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }

    public static Shape getSquare(String color){
        Square square = (Square)squareMap.get(color);

        if(square == null){
            square = new Square(color);
            squareMap.put(color, square);
            System.out.println("Creating square of color: " + color);
        }
        return square;
    }
}
