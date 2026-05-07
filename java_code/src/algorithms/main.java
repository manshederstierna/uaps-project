package algorithms;

import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		/* Fibonacci f = new Fibonacci();
		for(int i = 0; i < 1000; i++) {
			f.calcFibonacci(40);
		} */
		
		String path = "/home/manshederstierna/gitrepos/uaps-project/data.txt";
		String outpath = "/home/manshederstierna/gitrepos/uaps-project/java_sort_times.txt";
		for(int i=0; i < 5000; i++){
			IntegerSorter intsorter = new IntegerSorter(path);
			intsorter.readData();
			String time = Long.toString(intsorter.timeToSort());
			intsorter.write_to_file(time,i,outpath);
		}
		// TODO
	}

	

}
