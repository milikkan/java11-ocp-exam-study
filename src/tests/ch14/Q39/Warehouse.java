package tests.ch14.Q39;

import java.util.function.BooleanSupplier;

public class Warehouse {
    private int quantity = 40;
    private final BooleanSupplier stock;

    {
        stock = () -> quantity > 0;
    }

    public void checkInventory() {
//        if (stock.get()) // doesn't compile because method name is getAsBoolean(), not get()
        if (stock.getAsBoolean())
            System.out.println("Plenty!");
        else {
            System.out.println("On Backorder!");
        }
    }

    public static void main(String[] args) {
        final Warehouse w13 = new Warehouse();
        w13.checkInventory(); // Plenty!
    }
}
