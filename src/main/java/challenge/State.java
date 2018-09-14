package challenge;

public class State{
	private String Uf;
	private String nameState;
	private Double sizeState;
	
	public State(String Uf, String name) {
		this.Uf = Uf;
		this.nameState = name;
	}
	
	public State(String Uf, String name, Double sizeState) {
		this.Uf = Uf;
		this.nameState = name;
		this.sizeState = sizeState;
	}
	
	public String getUf() {
		return this.Uf;
	}
	
	public String getName() {
		return this.nameState;
	}

	public Double getSizeState() {
		return this.sizeState;
	}
}