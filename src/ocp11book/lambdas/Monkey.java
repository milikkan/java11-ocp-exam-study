package ocp11book.lambdas;

public class Monkey {
    static int pages = 0;

    interface Type {
        Object type(int writer);
    }

    public static void main(String... bananas) {
        boolean done = false;
        for (var b : bananas) {
            // 1. doesn't compile, t is defined twice in the scope
            // Type myType = t -> {int t = 2; return b + t;};

            // 2. doesn't compile, b is already defined
            // Type myType = b -> "";

            // 3. doesn't compile. done isn't effectively final
            // Type myType = x -> done ? 1 : 2;

            // 4. compiles fine. Lambdas can use instance ans static members
            Type myType4 = (var c) -> pages++;

            // 5. doesn't compile. missing semicolon after return statement. If semicolon was added, it compiles fine.
            // Type myType = u -> {return 6.2f};

            // 6. compiles fine. var can be used as an identifier in lambda.
            Type myType6 = var -> var;
            pages++;
        }
        done = true;
    }
}
