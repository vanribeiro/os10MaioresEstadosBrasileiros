package challenge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleReadCSV {
	private String arquivo;
	private String[] column;
	private String[] name = new String[27];
	private Double[] Uf = new Double[27];
	
	public SimpleReadCSV(String arquivo) {
		this.arquivo = arquivo;
	}
	
	public String getArquivo() {
		return arquivo;
	}
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	public String[] getColuna() {
		return column;
	}
	public void setColumn(String[] column) {
		this.column = column;
	}
	public String[] getName() {
		return name;
	}
	public void setNome(String[] name) {
		this.name = name;
	}
	public Double[] getUf() {
		return Uf;
	}
	public void setUf(Double[] Uf) {
		this.Uf = Uf;
	}
	
	public void reading() {
		
		try {
			System.setIn(new FileInputStream(new File(arquivo)));
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}
		
		int i = -1;
		Scanner read = new Scanner(System.in);
		String line;
		while(read.hasNext()) {
			i++;
			line = read.nextLine();
			column = line.split(";");
			name[i] = column[0];
			Uf[i] = Double.parseDouble(column[1].replace(",", "."));
		}
		read.close();
	}
}
