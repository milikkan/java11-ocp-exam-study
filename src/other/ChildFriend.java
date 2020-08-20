package other;

public class ChildFriend extends Child {
    void testIt() {
        Child c = new Child();
        System.out.println("y=" + c.y);
//        System.out.println("x=" + c.x); x is not accessible, it is protected
        System.out.println("x=" + x); // x is accessible when Child is inherited
    }

    public static void main(String[] args) {
        new ChildFriend().testIt();
    }
}
