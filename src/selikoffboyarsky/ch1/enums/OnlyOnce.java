package selikoffboyarsky.ch1.enums;

public enum OnlyOnce {
    ONCE(true);

    OnlyOnce(boolean b) {
        System.out.println("constructing");
    }

    public static void main(String[] args) {
        OnlyOnce firstCall = OnlyOnce.ONCE; // prints "constructing"
        OnlyOnce secondCall = OnlyOnce.ONCE; // doesn't print anything
    }
}
