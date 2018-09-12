package challenge;

import challenge.SimpleReadCSV;
import challenge.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main{
	static List<State> state = new ArrayList<State>();
	static Double[] Uf = new Double[27];
	static String[] name = new String[27];
	
	public List<State> listThe10largestStatesInBrazil() {
		State st = new State();
		
		for(int i = 0; i < 10; i++) {
			state.add(new State(Uf[i], name[i]));
		}
		
		Collections.sort(state, st.reversed());
		
		return state;
	}
	
	
	public static void StateResults() {
		System.out.printf("-------------------------------------------------\n");
		System.out.printf(" Os 10 maiores estados brasileiros - (1.000 Km\u00B2)\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("| Nº | Nome do Estado            | \006rea         |\n");
		System.out.printf("-------------------------------------------------\n");
		for(int i = 0; i < 10; i++){
			System.out.printf("| %02d | %-18s\t | %s\t|\n", 
					i+1, state.get(i).getName(), 
					state.get(i).getUf().toString().replace(".", ","));
		}System.out.printf("-------------------------------------------------\n");
	}
	
	public static void main(String[] args) {
		Main objectMain = new Main();
		String doc = "EstadosBrasileirosPorOrdemAlfabética.csv";
		SimpleReadCSV rdFile = new SimpleReadCSV(doc);
		rdFile.reading();
		
		Uf = rdFile.getUf();
		name = rdFile.getName();
		objectMain.listThe10largestStatesInBrazil();
		StateResults();
	}

}
