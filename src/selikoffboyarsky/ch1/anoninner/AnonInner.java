package selikoffboyarsky.ch1.anoninner;

import selikoffboyarsky.ch1.memberinner.A;
import selikoffboyarsky.ch3.compare.Animal;

abstract class SaleTodayOnly {
    abstract int dollarOff();
}

public class AnonInner {

/*    abstract class SaleTodayOnly {
        abstract int dollarOff();
    }*/
    interface SaleInterface {
        int dollarsOff();
    }

    public int admission(int basePrice) {
        // anonymous inner class
        // this class extends another class
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarOff() {
                return 3;
            }
        }; // don't forget the semicolon
        return basePrice - sale.dollarOff();
    }

    // overload admission
    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarOff();
    }

    public int pay() {
        // we can define anonymous inner classes right where they are needed
        // here, we define it as an argument to the method
        return admission(25, new SaleTodayOnly() {
            @Override
            int dollarOff() {
                return 5;
            }
        });
    }

    public int admissionUsingInterface(int basePrice) {
        // same thing but this time anonymous inner class implements the interface
        // there is not much change, except the method must be public
        SaleInterface sale = new SaleInterface() {
            @Override
            public int dollarsOff() {
                return 2;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        AnonInner inner = new AnonInner();
        System.out.println(inner.admission(10)); // 7
        System.out.println(inner.admissionUsingInterface(10)); // 8

        System.out.println(inner.pay()); // 20
    }
}
