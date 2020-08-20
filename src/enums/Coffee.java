package enums;

enum CoffeeSize {
    BIG(4),
    HUGE(6),
    OVERWHELMING(12) { // constant specific class body
        // overrides getLidCode() method
        public String getLidCode() {
            return "B";
        }
    }; // semicolon is required if there is code below

    private int ounces;

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }
    public int getOunces() {
        return this.ounces;
    }

    public String getLidCode() {
        return "A";
    }
}
public class Coffee {
    CoffeeSize size;

    public static void main(String[] args) {
        Coffee drink1 = new Coffee();
        drink1.size = CoffeeSize.BIG;

        Coffee drink2 = new Coffee();
        drink2.size = CoffeeSize.OVERWHELMING;

        System.out.println("Coffee1 size is " + drink1.size.getOunces());
        System.out.println("Coffee1 lid code is " + drink1.size.getLidCode());
        System.out.println("Coffee2 size is " + drink2.size.getOunces());
        System.out.println("Coffee2 lid code is " + drink2.size.getLidCode());

        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println(size + " " + size.getOunces() + " ounces - lid code: " + size.getLidCode());
        }
    }
}
