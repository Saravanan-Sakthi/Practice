package compiler;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class CompilerTest {
    public static void main(String[] args) {
        // Path to the source file
        String sourceFile = "/Users/saravanan-12380/saro/test/Test.java";

        // Get the Java Compiler
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        if (compiler == null) {
            System.out.println("No compiler is available. Make sure you are running this with a JDK, not a JRE.");
            return;
        }

        // Compile the source file
        int result = compiler.run(null, null, null, sourceFile);

        // Check the result
        if (result == 0) {
            System.out.println("Compilation successful.");
        } else {
            System.out.println("Compilation failed.");
        }
    }
}
