package enums;

class Coffee2 {
    enum CoffeeSize { BIG, HUGE, OVERWHELMING } // semicolon is optional here
    CoffeeSize size;
}

public class CoffeeTest2 {
    public static void main(String[] args) {
        Coffee2 drink = new Coffee2();
        drink.size = Coffee2.CoffeeSize.HUGE; // enclosing class name required
    }
}
