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
		if(heroName.compareTo(o.getHeroName()) == 0) {
			return heroAlias.compareTo(getHeroAlias());
		} else {
			return heroName.compareTo(o.getHeroName());
		}
	}
	
	public boolean equals(Avenger a) {
		return this.heroName.equals(a.heroName) || this.heroAlias.equals(a.heroAlias);
	}
	
	public int compareMostFrequent(Avenger a) {
		if(frequency == a.frequency) {
			return 0;
		} else if(frequency > a.frequency) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public int compareLeastFrequent(Avenger a) {
		if (frequency == a.frequency) {
			return 0;
		} else if(frequency > a.frequency) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public int getFrequency() {return frequency;}
	public String getHeroName() {return heroName;}
	public String getHeroAlias() {return heroAlias;}
	public void addFrequency(int frequency) {this.frequency++;}
	
	
	public String toString() {
		return heroAlias + " aka " + heroName + " mentioned " + frequency + " time(s)";
	}
}
