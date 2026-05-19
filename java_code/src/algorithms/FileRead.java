package algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
    String file_path = "../sample_text.txt";

    public long readFile() throws IOException {
        long t1 = System.nanoTime();

        try (BufferedReader br = new BufferedReader(new FileReader(file_path))) {
            String line;

            while ((line = br.readLine()) != null) {
            }
        }

        long t2 = System.nanoTime();
        return t2 - t1;
    }

    public static void write_to_file(String s, int n, String path) {
        try (FileWriter myWriter = new FileWriter(path, true)) {
            myWriter.write(n + "," + s + "\n");
            System.out.println("Wrote to file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}