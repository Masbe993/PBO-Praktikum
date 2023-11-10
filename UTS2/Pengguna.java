package UTS2;

abstract class Pengguna {
	protected String nama;
	
	public Pengguna(String nama) {
		this.nama = nama;
	}

	public abstract void indentifikasi();
}
