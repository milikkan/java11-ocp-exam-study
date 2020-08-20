package selikoffboyarsky.ch3.review;

class Hello<T> {
    T t;
    public Hello(T t) {
        this.t = t;
    }
    public String toString() {
        return t.toString();
    }
}

public class Q6 {
    public static void main(String[] args) {
        System.out.print(new Hello<String>("hi"));
        System.out.print(new Hello("there"));
        // threating T as Object, we can assign String and use Object.toString method
    }
}
