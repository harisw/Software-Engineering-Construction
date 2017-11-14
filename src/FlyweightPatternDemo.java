public class FlyweightPatternDemo {
    private static String colors[] = { "Red", "Green", "Blue"};
    public static void main(String[] args){

        for(int i = 0; i < 6; i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setRadius(100);
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
        for(int i = 0; i < 6; i++){
            Square square = (Square) ShapeFactory.getSquare(getRandomColor());
            square.setRadius(100);
            square.setX(getRandomX());
            square.setY(getRandomY());
            square.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX(){
        return (int)(Math.random()*100);
    }
    private static int getRandomY(){
        return (int)(Math.random()*100);
    }
}