public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            double randomNum = (int) (Math.random() * 36) + 50;
            System.out.println(randomNum);
        }
    }
}
