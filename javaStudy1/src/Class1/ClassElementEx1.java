package Class1;

public class ClassElementEx1 {
    static void main() {
        Rectangle r = new Rectangle(5, 8);
        int area = r.calculateArea();
        System.out.println("넓이 : " + area);
        int meter = r.calculatePerimeter();
        System.out.println("둘레 : " + meter);
        boolean s = r.isSquare();
        System.out.println("여부 : " + s);
    }
}

class Rectangle {
    int width;
    int height;
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int calculateArea(){
        return width * height;
    }
    int calculatePerimeter(){
        return 2 *(width + height);
    }
    boolean isSquare(){
        return width == height;
    }
}