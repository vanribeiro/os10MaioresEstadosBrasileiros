package challenge;

import challenge.SortListState;
import challenge.SimpleReadCSV;
import challenge.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
	static List<State> state = new ArrayList<State>();
	static Double[] Uf = new Double[27];
	static String[] name = new String[27];
	
	public List<State> listThe10largestStatesInBrazil() {
		
		
		SortListState justSort = new SortListState();
		
		for(int i = 0; i < 10; i++) {
			state.add(new State(Uf[i], name[i]));
		}
		
		Collections.sort(state, justSort.reversed());
		
		return state;
	}
	
	public static void StateResults() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1 + " " +
					state.get(i).getName() +
					" " + state.get(i).getUf());
		}
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
