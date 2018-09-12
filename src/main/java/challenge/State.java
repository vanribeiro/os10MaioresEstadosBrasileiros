package challenge;

import java.util.Comparator;

public class State implements Comparator<State>{
	
	private Double Uf;
	private String name;
	
	State() {
		
	}
	
	public State(Double Uf, String name) {
		this.Uf = Uf;
		this.name = name;
	}
	
	public Double getUf() {
		return Uf;
	}
	public void setUf(Double uf) {
		Uf = uf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compare(State o1, State o2) {
		return Double.compare(o1.getUf(), o2.getUf());
	}	

}
