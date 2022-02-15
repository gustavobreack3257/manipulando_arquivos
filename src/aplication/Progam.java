package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Progam {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoom", "Good nith"};
		
		String path = "c:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			BufferedReader br = new BufferedReader(new FileReader(path));
			path = br.readLine();
			
			while(path != null) {
				System.out.println(path);
				br.readLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
