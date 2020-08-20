package selikoffboyarsky.ch1.enums;

enum Season {
    WINTER("Low") {
        public void printHours() {
            System.out.println("9am-3pm");
        }
    },
    SPRING("Medium") /*{
        public void printHours() {
            System.out.println("9am-5pm");
        }
    }*/,
    SUMMER("High") {
        public void printHours() {
            System.out.println("9am-7pm");
        }
    },
    FALL("Medium") /*{
        public void printHours() {
            System.out.println("9am-5pm");
        }
    }*/; // semicolon is mandatory if there are more lines below

    private String expectedVisitors;

    private Season(String expectedVisitors) { // we can remove private but cannot use public or protected
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }

//    public abstract void printHours();
    public void printHours() {
        System.out.println("default hours");
    }
}

public class WorkingWithEnums {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER); // prints SUMMER
        System.out.println(s == Season.SUMMER); // we can use ==

        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
            // season.name() is same as season because there is a default toString()
        }

        Season s1 = Season.valueOf("FALL");
        System.out.println(s1); // FALL
        // Season s2 = Season.valueOf("fall"); // IllegalArgumentException, string must match one of enum values

        // enum in switch
        switch (Season.SUMMER) {
            case WINTER:
                System.out.println("cold");
                break;
            case SUMMER:
                System.out.println("hot");
                break;
            case FALL:
                System.out.println("fall is nice");
                break;
            /*case Season.SPRING: // compiler error
                break;*/
        }

        Season.SUMMER.printExpectedVisitors(); // High

//        Season.FALL.printHours(); // 9am-5pm
        Season.FALL.printHours(); // default hours
        Season.SUMMER.printHours(); // 9am-7pm
    }
}
