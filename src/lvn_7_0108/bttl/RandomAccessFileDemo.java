package lvn_7_0108.bttl;

import java.io.*;

class RandomAccessFileDemo {
    public static void main(String args[]) throws IOException {
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;
        RandomAccessFile raf;
        try {
            raf = new RandomAccessFile("src/lvn_7_0108/bttl/test.txt", "rw");
        } catch (FileNotFoundException exc) {
            System.out.println("Cannot open file.");
            return;
        }
        // Write values to the file.
        for (int i = 0; i < data.length; i++) {
            try {
                raf.writeDouble(data[i]);
            } catch (IOException exc) {
                System.out.println("Error writing to file.");
                return;
            }
        }
    }
}