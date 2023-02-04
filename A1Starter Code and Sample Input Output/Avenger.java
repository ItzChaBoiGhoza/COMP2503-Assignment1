public class Avenger implements Comparable <Avenger>{

	private String heroName;
	private String heroAlias;
	private int frequency;
	
	public Avenger(String name, String alias) {
		heroName = name;
		heroAlias = alias;
		frequency = 1;
	}

	@Override
	public int compareTo(Avenger o) {
		if(heroName.compareTo(o.getHeroName()) == 0) {
			return heroAlias.compareTo(getHeroAlias());
		} else {
			return heroName.compareTo(o.getHeroName());
		}
	}
	
	// The equals method must return true if two Avenger objects have the same alias.
	public boolean equals(Object other)
	{
	if(other == this) {
	return true;
	}

	if(other == null) {
	return false;
	}

	if(this.getClass() != other.getClass()) {
	return false;
	}

	if(this.getHeroAlias() == ((Avenger) other).getHeroAlias()) {
	return true;
	}

	Avenger p = (Avenger)other;

	return this.getHeroAlias().equals(p.getHeroAlias());

	}
	
	public String setHeroName() {return this.heroName;}
	public String setHeroAlias() {return this.heroAlias;}
	public int getFrequency() {return this.frequency;}
	public String getHeroName() {return heroName;}
	public String getHeroAlias() {return heroAlias;}
	public void addFrequency() {this.frequency++;}
	
	
	public String toString() {
		return heroAlias + " aka " + heroName + " mentioned " + frequency + " time(s)";
	}
}
