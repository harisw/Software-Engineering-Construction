public class Square implements Shape{
    private String color;
    private int x;
    private int y;
    private int radius;

    public Square(String color){

        this.color = color;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Square: Draw() [Color "+ color + ", width : " + x + ", height :"+ y + ", diagonal : "+ radius);
    }
}
