public class Avenger implements Comparable <Avenger>{

	private String heroName;
	private String heroAlias;
	private int frequency;
	
	public Avenger( ) {
		heroName = "";
		heroAlias = "";
		frequency = 0;
	}
	
	@Override
	public int compareTo(Avenger o) {
		return this.heroAlias.compareTo(o.heroAlias);
	}
	
	public int getFrequency() {return frequency;}
	public void setName(String name) {heroName = name;}
	public void setAlias(String alias) {heroAlias = alias;}
	public String getName() {return heroName;}
	public String getAlias() {return heroAlias;}
	
	public String toString() {
		return heroAlias + " aka " + heroName + " mentioned " + frequency + " time(s)";
	}
}
