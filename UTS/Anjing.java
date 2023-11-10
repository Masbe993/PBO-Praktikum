package UTS;

public class Anjing extends Hewan{
	public Anjing(String Sound) {
		super("Gog Gog");
	}
	
	public void bersuara() {
		System.out.println("Suara si Anjing: "+Sound);
	}
	
	public void jenis() {
		System.out.println("Hewan ini addalah Mamalia");
	}

}
