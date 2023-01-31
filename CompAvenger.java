package Names;

import java.util.Comparator;

public class CompAvenger implements Comparator<Avenger> {

	@Override
	public int compare(Avenger o1, Avenger o2) {
		if(o1.getHeroName().equals(o2.getHeroName()))
			return 0;
		if(o1.getHeroName() == null) {
			return 1;
		}
		if(o2.getHeroName() == null) {
			return -1;
		}
		return o1.compareTo(o2);
	}

}


