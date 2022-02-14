package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Progam {

	public static void main(String[] args) {
		String path = "c:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if(fr != null){
					fr.close();
				}
				if(br != null) {
					br.close();
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
		/*File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		*/
}
