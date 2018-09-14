package challenge;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import challenge.State;

public class Main{
	
	public List<State> listThe10largestStatesInBrazil(List<State> rdStates) {
		Comparator<State> compareSizeState = new Comparator<State>() {
			public int compare(State one, State two) {
				return Double.compare(one.getSizeState(), two.getSizeState());
			}
		};
		
		Collections.sort(rdStates, compareSizeState.reversed());
		return rdStates.subList(0, 10);
	}
	
	public static void stateResults(List<State> rdStates) {
		System.out.printf("-------------------------------------------------\n");
		System.out.printf(" Os 10 maiores estados brasileiros - (1.000 Km\u00B2)\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("| Nº | Nome do Estado            | \006rea         |\n");
		System.out.printf("-------------------------------------------------\n");
		for(int i = 0; i < 10; i++){
			State state = rdStates.get(i);
			System.out.printf("| %02d | %-18s\t | %s\t|\n", 
					i+1, 
					state.getName(), 
					state.getSizeState().toString().replace(".", ","));
		}System.out.printf("-------------------------------------------------\n");
	}
	
	public static void main(String[] args) throws IOException {
		Main objectMain = new Main();
		String docFile = "EstadosBrasileirosPorOrdemAlfabética.csv";
		SimpleReadCSV readingFile = new SimpleReadCSV();
		List<State> statesList = readingFile.readingFile(docFile);
		List<State> top10States = objectMain.listThe10largestStatesInBrazil(statesList);
		stateResults(top10States);
	}
	
}
