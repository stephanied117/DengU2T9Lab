public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle tri1 = new RightTriangle(3, 4);
        double angle1 = tri1.hypotenuse();
        RightTriangle tri2 = new RightTriangle(6.5, 10.7);
        double angle2 = tri2.hypotenuse();
        System.out.println(angle1);
        System.out.println(angle2);
    }
}
