package challenge;

public class State {
	
	private Double Uf;
	private String name;
	
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
	
	

}
