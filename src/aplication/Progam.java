package aplication;

import java.io.File;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		//nome do arquivo
		System.out.println("getName: " + path.getName());
		//parte do caminho do arquivo
		System.out.println("getParent" + path.getParent());
		//caminho completo do arquivo
		System.out.println("getPath" + path.getPath());
		sc.close();
	}
		
}
