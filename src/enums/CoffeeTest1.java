package enums;

enum CoffeeSize1 { BIG, HUGE, OVERWHELMING }

class Coffee1 {
    CoffeeSize1 size;
}

public class CoffeeTest1 {
    public static void main(String[] args) {
        Coffee1 drink = new Coffee1();
        drink.size = CoffeeSize1.BIG;
    }
}
