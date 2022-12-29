package Day03SecondHalf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	static char result;
	public static void main(String[] args) {
		
		BufferedReader reader;

		Alphabet alphabet = new Alphabet();
		int sum = 0;
		
		char[] arr1 = null;
		char[] arr2 = null; 
		char[] arr3 = null;
		
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\adamc\\eclipse-workspace\\Day03\\src\\Day03\\input.txt"));
			String line = reader.readLine();

			while (line != null) {
				
		
			for(int i = 0; i < 3; i++) {
				
				if(i == 0) {
				arr1 = line.toCharArray();
				}
				
				if(i == 1) {
				arr2 = line.toCharArray();
				}
				
				if(i == 2) {
				arr3 = line.toCharArray();
				}
				line = reader.readLine();
					
			}
				
			for (int i = 0; i < arr1.length; i++) {
				
				for(int j = 0; j < arr2.length; j++) {
					
					for(int k = 0; k < arr3.length; k++) {
						
						if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
							result = arr1[i];
						}
					}
				}
			}
			
			
			
			
	        sum += (alphabet.alphabet.indexOf(result) + 1);	
			
		}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Answer is:" + sum);
	
	}
}
