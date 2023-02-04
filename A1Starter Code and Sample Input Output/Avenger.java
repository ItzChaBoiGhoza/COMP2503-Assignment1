public class Avenger implements Comparable <Avenger>{

	private String heroName;
	private String heroAlias;
	private int frequency;
	
	public Avenger(String name, String alias) {
		heroName = name;
		heroAlias = alias;
		frequency = 0;
	}

	@Override
	public int compareTo(Avenger o) {
		if(heroAlias.compareTo(o.getHeroAlias()) == 0) {
			return heroName.compareTo(getHeroName());
		} else {
			return heroAlias.compareTo(o.getHeroAlias());
		}
	}
	
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
		return heroAlias + " aka " + heroName + " mentioned " + frequency + " time(s)" + "\n";
	}
}
