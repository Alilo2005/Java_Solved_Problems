package aliPackage;
import java.awt.Point;
public class Circle {
      Point center;
      double radius;

      public Circle(){}

      public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
      }

      public  double getPerimeter(){
          return 2*Math.PI*this.radius;
      }

      public double getArea(){
          return Math.PI*Math.pow(radius,2);
      }


}
