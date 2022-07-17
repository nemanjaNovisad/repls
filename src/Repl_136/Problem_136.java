package repl136;

public class Problem_136 {
    private static void privateMethod() {
        System.out.println("This is Private Method");
    }

    void defaultMethod() {
        System.out.println("This is Default Method");
    }

    protected static void protectedMethod() {
        System.out.println("This is Protected Method");
    }

    public void publicMethod() {
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        repl136.Problem_136 obj = new repl136.Problem_136();
        privateMethod();
        obj.defaultMethod();
        protectedMethod();
        obj.publicMethod();
    }
}

