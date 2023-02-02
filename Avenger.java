package Names;

public class Avenger implements Comparable <Avenger>{ 
	private String heroName;
	private String heroAlias;
	private int frequency;
	
	public Avenger(String name, String alias) {
		heroName = name;
		heroAlias = alias;
		frequency = 0;
	}

	public String getHeroName() {
		return heroName;
	}

	public String getHeroAlias() {
		return heroAlias;
	}

	public int getFrequency() {
		return frequency;
	}

	public void addFrequency(int frequency) {
		this.frequency++;
	}
	
	public String toString() {
		String format = heroAlias + " aka " + heroName
				+ " mentioned " + frequency + " time(s)";
		return format;
	}


	@Override
	public int compareTo(Avenger o) {
		if(heroName.compareTo(o.getHeroName()) == 0) {
			return heroAlias.compareTo(o.getHeroAlias());
		}
		else return heroName.compareTo(o.getHeroName());
		
	}
	
	public int compareMostFrequent(Avenger o) {
		if(frequency == o.frequency) {
			return 0;
		}
			else if(frequency > o.frequency) {
			return 1;
			}
			else 
			return -1;
			}
	
	public int compareLeastFrequent(Avenger o) {
		if(frequency == o.frequency) {
			return 0;
			}
			else if(frequency > o.frequency) {
			return -1;
			}
			else 
			return 1;
			}
	
	public boolean equalAvenger(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		Avenger avenger = (Avenger)o;
		return heroAlias == avenger.heroAlias;
		
	}
	
	
	

}
