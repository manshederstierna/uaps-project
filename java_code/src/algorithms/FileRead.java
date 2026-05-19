package algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
    String file_path = "../sample_text.txt";
    BufferedReader br;
    public FileRead(){
        try {
            this.br = new BufferedReader(new FileReader(file_path));

        } catch(IOException e) {
            e.printStackTrace();
        }

    };

    public long readFile() throws IOException {
        long t1 = System.nanoTime();
        String line;
        while((line = br.readLine()) != null) {
        }

        long t2 = System.nanoTime();
        long delta = t2 - t1;
        return delta;
    }

    public static void write_to_file(String s, int n,String path) {
        try {
            FileWriter myWriter = new FileWriter(path,true);
            myWriter.write(n + "," + s + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
