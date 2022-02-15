package aplication;

import java.io.File;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		// Percorre todas as pastas, dentro da pasta declarada.
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for(File file : files) {
			System.out.println(file);
		}
		// cria uma sub pasta
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created sucess" + sucess);
		
		
		sc.close();
	}
		
}
