package challenge;

import java.util.Comparator;

public class SortListState implements Comparator<State> {

	@Override
	public int compare(State uf1, State uf2) {
		
		return uf1.getUf().compareTo(uf2.getUf());
	}

}
