import aliPackage.Circle;
import aliPackage.Queue;
import aliPackage.Stack;
import aliPackage.Sum;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1,2),3);
        System.out.println(c1.getArea());

        Queue q1 = new Queue(3);
        q1.insert(5);
        System.out.println(q1.peek());

        Sum sum1 = new Sum(100);
        System.out.println(sum1.cubic());

        Stack s1 = new Stack();
        s1.push(6);
        System.out.println(s1.peek());
        s1.pop();
        System.out.println(s1.peek());
    }
}