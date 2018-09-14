package challenge;

public class State{
	private String nameState;
	private Double sizeState;
	
	public State(String name, Double sizeState) {
		this.nameState = name;
		this.sizeState = sizeState;
	}
	
	public String getName() {
		return this.nameState;
	}

	public Double getSizeState() {
		return sizeState;
	}
	
}
