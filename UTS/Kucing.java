package UTS;

public class Kucing extends Hewan {
	public Kucing(String Sound) {
		super("Meong");
	}

	public void bersuara() {
		System.out.println("Suara si Kucing: "+Sound);
	}
	
	public void jenis() {
		System.out.println("Hewan ini addalah Mamalia");
	}
}
