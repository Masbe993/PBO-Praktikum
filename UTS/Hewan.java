package UTS;

public class Hewan {
	protected String Sound;
	
	public Hewan(String jenisSuara) {
		this.Sound = jenisSuara;
	}
	
	public void bersuara() {
		System.out.println("Hewan Bersuara: "+Sound);
	}
}
