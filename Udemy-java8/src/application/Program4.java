package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "d:\\in.txt";
		
		//Add o par�metro true, faz com que o programa n�o crie um novo arquivo,
		//ele acrescenta o que passa
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
