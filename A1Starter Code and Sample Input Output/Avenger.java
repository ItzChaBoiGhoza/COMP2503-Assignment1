import java.util.Comparator;

public class Avenger implements Comparable <Avenger>{

	private String heroName;
	private String heroAlias;
	private int frequency;
	
	public Avenger(String alias, String name) {
		heroName = name;
		heroAlias = alias;
		frequency = 0;
	}

	@Override
	public int compareTo(Avenger a) {
		return this.heroAlias.compareTo(a.getHeroAlias());
	}
	
	public static Comparator<Avenger> MostPopular = new Comparator<Avenger>() {
		public int compare(Avenger a, Avenger b) {
			int freq1 = a.getFrequency();
			int freq2 = b.getFrequency();
			
			if(freq2-freq1 == 0) {
				return a.getHeroAlias().compareTo(b.getHeroAlias());
			}
			return freq2-freq1;
		}
	};
	
	// The equals method must return true if two Avenger objects have the same alias.
	public boolean equals(Object o) {
	if(o == this) { return true;}
	if(o == null) { return false; }
	if(this.getClass() != o.getClass()) { return false; }
	if(this.getHeroAlias() == ((Avenger) o).getHeroAlias()) { return true; }
	Avenger p = (Avenger)o;
	return this.getHeroAlias().equals(p.getHeroAlias());
	}
	
	
	public int getFrequency() {return frequency;}
	public String getHeroName() {return heroName;}
	public String getHeroAlias() {return heroAlias;}
	public void addFrequency() {frequency++;}
	
	
	public String toString() {
		return heroAlias + " aka " + heroName + " mentioned " + frequency + " time(s)";
	}
}
