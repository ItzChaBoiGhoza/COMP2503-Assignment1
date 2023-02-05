import java.util.Comparator;

public class LeastPopular implements Comparator<Avenger> {

	@Override
	public int compare(Avenger a, Avenger b) {
		int freq1 = a.getFrequency();
		int freq2 = b.getFrequency();
		
		if(freq1-freq2 == 0) {
			int result;
			if(a.getHeroName().length() < b.getHeroName().length()) {
				result = b.compareTo(a);
			} else if (a.getHeroName().length() == b.getHeroName().length()){
				result = a.getHeroName().compareTo(b.getHeroName());
			} else {
				result = a.compareTo(b);
			}
			return result;
		}
		return freq1-freq2;
	}

}