package selikoffboyarsky.ch1.review.Q9;

public class Outer {
    private int x = 24;

    public int getX() {
        String message = "x is ";
        class Inner {
            private int x = Outer.this.x;
            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x; // 24
    }

    public static void main(String[] args) {
        new Outer().getX(); // X is 24
    }
}
