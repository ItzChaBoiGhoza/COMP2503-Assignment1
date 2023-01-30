package Names;

public class Avenger implements Comparable <Avenger>{ 
	private String heroName;
	private String heroAlias;
	private int frequency;
	
	public Avenger() {
		heroName = "";
		heroAlias = "";
		frequency = 0;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroAlias() {
		return heroAlias;
	}

	public void setHeroAlias(String heroAlias) {
		this.heroAlias = heroAlias;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	public String toString() {
		String format = heroAlias + " aka " + heroName
				+ " mentioned " + frequency + " time(s)";
		return format;
	}
	
	public void checkAvenger() {
		int count = 0;
		for(int i = 0; i > count; i++) {
			count++;
		}
	}

	@Override
	public int compareTo(Avenger o) {
		if(heroName.compareTo(o.getHeroName()) == 0) {
			return heroAlias.compareTo(o.getHeroAlias());
		}
		else return heroName.compareTo(o.getHeroName());
	}
	
	
	
	

}
