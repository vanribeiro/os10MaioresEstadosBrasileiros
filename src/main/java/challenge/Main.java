package challenge;

import challenge.SortListState;
import challenge.SimpleReadCSV;
import challenge.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
	static List<State> state = new ArrayList<State>();
	static String[] Uf = new String[28];
	static String[] name = new String[28];
	static Double[] largeState = new Double[28];
	
	public List<State> listThe10largestStatesInBrazil() {
		
		
		SortListState justSort = new SortListState();
		
		for(int i = 0; i <= 10; i++) {
			state.add(new State(Uf[i], name[i]));
		} state.remove(0);
		//Collections.sort(state, justSort.reversed());
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1 + " " +
					state.get(i).getName() +
					" " + state.get(i).getUf());
		}
		
		return state;
	}
	
	public static void main(String[] args) {
		Main objectMain = new Main();
		String doc = "EstadosBrasileirosPorOrdemAlfabética.csv";
		SimpleReadCSV rdFile = new SimpleReadCSV(doc);
		rdFile.reading();
		
		Uf = rdFile.getUf();
		name = rdFile.getName();
		objectMain.listThe10largestStatesInBrazil();
		
	}

}
