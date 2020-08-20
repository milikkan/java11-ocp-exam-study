package selikoffboyarsky.ch1.memberinner;

// an example of 3 nested classes
// and referencing outer class members from inners
// do not code like this in real life
public class A {
    private int x = 10;

    class B {
        private int x = 20;

        class C {
            private int x = 30;

            public void allTheX() {
                System.out.println(x); // 30
                System.out.println(this.x); // 30
                System.out.println(B.this.x); // 20
                System.out.println(A.this.x); // 10
            }
        } // Class C
    } // Class B

    public static void main(String[] args) {
        A a = new A();
        B b = a.new B();
//        A.B b = a.new B(); // we can also say A.B
        B.C c = b.new C();
//        A.B.C c = b.new C(); // we can also say A.B.C
        c.allTheX();
    }
} // Class A
