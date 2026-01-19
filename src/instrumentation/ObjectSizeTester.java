package instrumentation;

import java.lang.instrument.Instrumentation;

public class ObjectSizeTester {
    public static void agentmain(String abc, Instrumentation inst) {
        System.out.println("Inside Agent Class");
    }
}
