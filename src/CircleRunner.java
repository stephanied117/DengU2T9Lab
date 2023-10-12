public class CircleRunner {
    public static void main(String [] args) {
        Circle circ = new Circle(5.0);
        System.out.println(circ.getInfo());
        circ.setRadius(9.2);
        System.out.println(circ.getInfo());
    }
}
