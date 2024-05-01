package iostreams;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class StreamTest {
    public static void main(String[] args) {
        //bufferedWriterTest();
        //scannerTest();
        //consoleTest();
        //dataStreamsTest();
        bufferedReaderCloseTest();
    }
    private static void bufferedWriterTest() throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("/home/local/ZOHOCORP/saravanan-12380/saro/java/practice/streams/test.txt"));
            int i =97;
            for (; i<110 ; i++) {
                writer.write(i);
                if(i==105) {
                    writer.flush();
                    Thread.sleep(10000);
                }
            }
            if(i==109) {
                writer.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(writer != null) {
                writer.close();
            }
        }
    }

    private static void scannerTest(){
        try {
            Scanner scan = new Scanner(new FileInputStream("/home/local/ZOHOCORP/saravanan-12380/saro/java/practice/streams/sampletext.txt"));
            while(scan.hasNext()) {
                System.out.println(scan.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void consoleTest(){
        Console console = System.console();
        if (console != null) {
            String in = console.readLine("say something : ");
            char[] password = console.readPassword("Enter any pass");
            System.out.format("%s %n %s",in, Arrays.toString(password));
        } else {
            System.out.println("No Console");
        }
    }

    private static void dataStreamsTest(){
        String path = "/home/local/ZOHOCORP/saravanan-12380/saro/java/practice/streams/dstest";
        double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
        int[] units = { 12, 8, 13, 29, 50 };
        String[] descs = {
                "Java T-shirt",
                "Java Mug",
                "Duke Juggling Dolls",
                "Java Pin",
                "Java Key Chain"
        };
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
            for (int i = 0; i < prices.length; i ++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
            out.flush();
            out.close();

            DataInputStream in = new DataInputStream(new
                    BufferedInputStream(new FileInputStream(path)));

            double price;
            int unit;
            String desc;
            double total = 0.0;
            try {
                while (true) {
                    price = in.readDouble();
                    unit = in.readInt();
                    desc = in.readUTF();
                    System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                            unit, desc, price);
                    total += unit * price;
                }
            } catch (EOFException e) {
                in.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedReaderCloseTest() {
        try {
            FileReader reader = new FileReader("/Users/saravanan-12380/saro/cdpcodenotes/usecase4.txt");
            BufferedReader br = new BufferedReader(reader);
            br.close();
            System.out.println(reader.read());
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
