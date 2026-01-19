package methodhandles;


import java.io.*;
import java.lang.invoke.MethodHandles;

public class MethodHandlesTest {
    public static void main(String[] args) {
        File file = new File("/Users/saravanan-12380/saro/learning/projects/GCTest/out/production/GCTest/gc/GCTest.class");
        try {
            byte[] classByte = read(file);
            System.out.println(new String(classByte));
            Class classobj = MethodHandles.lookup().defineClass(classByte);
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    public static byte[] read(File file) throws IOException {
        ByteArrayOutputStream ous = null;
        InputStream ios = null;
        try {
            byte[] buffer = new byte[4096];
            ous = new ByteArrayOutputStream();
            ios = new FileInputStream(file);
            int read = 0;
            while ((read = ios.read(buffer)) != -1) {
                ous.write(buffer, 0, read);
            }
        }finally {
            try {
                if (ous != null)
                    ous.close();
            } catch (IOException e) {
            }

            try {
                if (ios != null)
                    ios.close();
            } catch (IOException e) {
            }
        }
        return ous.toByteArray();
    }
}
