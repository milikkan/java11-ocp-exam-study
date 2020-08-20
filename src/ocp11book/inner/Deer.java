package ocp11book.inner;

public class Deer {
    enum Food {APPLES, BERRIES, GRASS}

    protected class Diet {
        private Food getFavorite() {
            return Food.BERRIES;
        }
    }

    public static void main(String[] args) {
//        switch (new Diet().getFavorite()) { // doesn't compile, inner class needs an instance of outer
        switch (new Deer().new Diet().getFavorite()) {
            case APPLES:
                System.out.println("a");
            case BERRIES:
                System.out.println("b");
            default:
                System.out.println("c");
        }
    }
}
