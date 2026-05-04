package algorithms;
import java.io.FileWriter;   
import java.io.IOException;
import java.io.File;



public class Fibonacci {
	public Fibonacci() {	
	}
	
	public static void write_to_file(String s, int n) {
		 try {
			  FileWriter myWriter = new FileWriter("C:\\Users\\clara\\OneDrive\\Dokument\\LTH\\Utvärdering_av_programvarusystem\\uaps-project\\java_fib_times.txt",true);		      myWriter.write(n + "," + s + "\n");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}
	
	
	
	public static void calcFibonacci(int n) {
		long t1 = System.nanoTime();
		int x = priv_calcFibonacci(n);
		long t2 = System.nanoTime();
		long delta = t2-t1;
		write_to_file(Long.toString(delta), n);
		
		
	}
	
	private static int priv_calcFibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return priv_calcFibonacci(n-1) + priv_calcFibonacci(n-2);
		}
	}
	
}


