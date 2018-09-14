package challenge;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import challenge.State;


public class SimpleReadCSV{
	private String docFile;
	
	public String getDocFile() {
		return this.docFile;
	}
	
	List<State> readingFile(String docFile) throws IOException{
		List<State> rdStates = new ArrayList<State>();
		
		try {
			System.setIn(new FileInputStream(new File(docFile)));
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo Não Encontrado!");
		}
		
		Scanner reading = new Scanner(System.in);
		String line;
		while(reading.hasNext()) {
			line = reading.nextLine();
			String[] column = line.split(";");
			String nameState = column[0];
			Double sizeState = Double.parseDouble(column[1].replace(",", "."));
			rdStates.add(new State(nameState, sizeState));
		}
		reading.close();
		return rdStates;
	}
}