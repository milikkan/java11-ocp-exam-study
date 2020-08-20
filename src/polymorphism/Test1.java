package polymorphism;

class Super {
    public void doIt(int i) {
        System.out.println("Super version");
    }
}

class Sub extends Super {

    public void doIt(int i) {
        super.doIt(2);
        //System.out.println("Sub version");
    }

}

public class Test1 {
    public static void main(String[] args) {
        Super superior = new Super();
        Super superSub = new Sub();
        Sub sub = new Sub();

        superior.doIt(2);
        superSub.doIt(2);
        sub.doIt(2);
    }
}
