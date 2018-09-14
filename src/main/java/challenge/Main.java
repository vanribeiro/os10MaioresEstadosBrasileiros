package challenge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import challenge.State;

public class Main{
	
	public List<State> listThe10largestStatesInBrazil() {
		List<State> state = new ArrayList<State>();
		state.add(new State("AC","Acre", 152.5));
		state.add(new State("AL","Alagoas", 27.7));
		state.add(new State("AM","Amazonas", 1570.7));
		state.add(new State("AP","Amapá", 142.8));
		state.add(new State("BA","Bahia", 564.8));
		state.add(new State("CE","Ceará", 148.8));
		state.add(new State("DF","Distrito Federal", 5.8));
		state.add(new State("ES","Espírito Santo", 46.0));
		state.add(new State("GO","Goiás", 340.0));
		state.add(new State("MA","Maranhão", 332.0));
		state.add(new State("MG","Minas Gerais", 587.5));
		state.add(new State("MS","Mato Grosso do Sul", 357.1));
		state.add(new State("MT","Mato Grosso", 903.3));
		state.add(new State("PA","Pará", 1247.6));
		state.add(new State("PB","Paraíba", 56.4));
		state.add(new State("PE","Pernambuco", 98.3));
		state.add(new State("PI","Piauí", 251.5));
		state.add(new State("PR","Paraná", 199.3));
		state.add(new State("RJ","Rio de Janeiro", 43.6));
		state.add(new State("RN","Rio Grande do Norte", 52.8));
		state.add(new State("RO","Rondônia", 237.5));
		state.add(new State("RR","Roraima", 224.5));
		state.add(new State("RS","Rio Grande do Sul", 281.7));
		state.add(new State("SC","Santa Catarina", 95.3));
		state.add(new State("SE","Sergipe", 21.9));
		state.add(new State("SP","São Paulo", 248.2));
		state.add(new State("TO","Tocantins", 277.6));
		
		Comparator<State> compareSizeState = new Comparator<State>() {
			public int compare(State one, State two) {
				return Double.compare(one.getSizeState(), two.getSizeState());
			}};
		
		Collections.sort(state, compareSizeState.reversed());
		return state.subList(0, 10);
	}
	
	public static void main(String[] args) throws IOException {
		Main objectMain = new Main();
		objectMain.listThe10largestStatesInBrazil();
	}
	
}
