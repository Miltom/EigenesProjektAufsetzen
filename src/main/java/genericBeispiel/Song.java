package genericBeispiel;

public class Song implements Comparable<Song> {

	private String sänger;
	private String title;
	private String dauer;
	private int erscheinungsjahr;

	public Song(String sänger, String title, String dauer, int erscheinungsjahr) {
		this.sänger = sänger;
		this.title = title;
		this.dauer = dauer;
		this.erscheinungsjahr = erscheinungsjahr;
	}

	public String getSänger() {
		return sänger;
	}

	public void setSänger(String sänger) {
		this.sänger = sänger;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDauer() {
		return dauer;
	}

	public void setDauer(String dauer) {
		this.dauer = dauer;
	}

	public int getErscheinungsjahr() {
		return erscheinungsjahr;
	}

	public void setErscheinungsjahr(int erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}

	public int compareTo(Song song) {
		return sänger.compareTo(song.getSänger());
	}

	public static void main(String[] args) {
		Song song1 = new Song("Miachel Jackson", "Beat it", "3:14", 1986);
		Song song2 = new Song("Rihanna", "Diamonds", "3:56", 2012);
		Song song3 = new Song("Miachel Jackson", "Beat it", "3:14", 1986);
		System.out.println(song1.compareTo(song2));
		System.out.println(song1.compareTo(song3));
	}
}
