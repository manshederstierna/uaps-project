package algorithms;

import java.io.*;
import java.util.ArrayList;


public class IntegerSorter {
    ArrayList<Integer> numbers = new ArrayList<>();
    BufferedReader br;
    String pathOut;
    
	public IntegerSorter(String path) {
		try {
			this.br = new BufferedReader(new FileReader(path));

		} catch(IOException
				e) {
            e.printStackTrace();
		}
	}
	
	public void readData() throws IOException {
		String line;
		while((line = br.readLine()) != null) {
			numbers.add(Integer.parseInt(line));
		}
	}
	
	
	public void insertionSort() {
		for(int i=0; i 	< numbers.size(); i++) {
			int key = numbers.get(i);
			int j = i-1;
	
			while(j >= 0 && numbers.get(j) > key) {
				numbers.set(j+1, numbers.get(j));
				j--;
			}
			numbers.set(j+1,key);
		}
		
	}

	public long timeToSort() throws IOException {
		this.readData();
		long t1 = System.nanoTime();
		this.insertionSort();
		long t2 = System.nanoTime();
		return t2 - t1;
	}
	
	
	
	
}
