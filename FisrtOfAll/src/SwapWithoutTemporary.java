import java.awt.*;

public class SwapWithoutTemporary {
    public static void main(String[] args){
        Point p = new Point();
        p.x = 5;
        p.y = 6;
        Swap(p);
        System.out.println(p.x);
        System.out.println(p.y);
    }
    public static void Swap(Point p){
       p.x += p.y;
       p.y  = p.x - p.y;
       p.x -= p.y;
    }
}
