package performancetest;

public class MethodCallVsStatements {
    public static void main(String[] args) {
        methodCallFunction();
        statementFunction();
    }

    private static void statementFunction() {
        long startedTime = System.currentTimeMillis();
        for (int i = 0 ; i<100000000 ; i++) {
            int a = 1;
            int b = a + 1;
            int c = b + 1;
            a = c + 1;
        }
        System.out.println("Statement function time taken : "+(System.currentTimeMillis() - startedTime));
    }

    private static void methodCallFunction() {
        long startedTime = System.currentTimeMillis();
        for (int i = 0 ; i<100000000 ; i++) {
            runStatements();
        }
        System.out.println("Method call function time taken : "+(System.currentTimeMillis() - startedTime));
    }
    private static void runStatements() {
        int a = 1;
        int b = a + 1;
        int c = b + 1;
        a = c + 1;
    }
}
