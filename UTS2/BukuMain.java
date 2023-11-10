package UTS2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BukuMain {
	
	public static void hapusBuku(List<Buku> daftarBuku, Buku buku) {
		if(daftarBuku.contains(buku)) {
			daftarBuku.remove(buku);
			System.out.println("Buku sudah berhasil dihapus.");
		}else {
			System.out.println("Buku tidak ditemukan.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		List<Buku> daftarBuku = new ArrayList<Buku>();
		daftarBuku.add(new Fiksi("BUMI TERELIYE"));
		daftarBuku.add(new Nonfiksi("Conan Edge "));
		
		System.out.print("Login (User/Admin): ");
		String login = input.nextLine();
		if(login.equalsIgnoreCase("User")) {
			System.out.print("Masukan Nama User: ");
			String nama = input.nextLine();
			User user = new User(nama);
			user.indentifikasi();
			System.out.println();
			user.liatBuku(daftarBuku);
		} else if(login.equalsIgnoreCase("Admin")){
			System.out.print("Masukan Nama Admin: ");
			String nama = input.nextLine();
			Admin admin = new Admin(nama);
			admin.indentifikasi();
			System.out.println();
			System.out.println("Pilih Menu:");
			System.out.println("1. Tambah Buku");
			System.out.println("2. Lihat Daftar Buku");
			System.out.println("3. Hapus buku");
			System.out.print("Masukan Pilihan Menu (1-3): ");
			int pil = input.nextInt();
			input.nextLine();
			switch (pil) {
			case 1: {
				System.out.println();
				System.out.print("Masukan judul Buku Baru: ");
				String JBaru = input.nextLine();
				System.out.print("Masukan Genre Buku: ");
				String GBaru = input.nextLine();
				if(GBaru.equalsIgnoreCase("Fiksi")) {
					daftarBuku.add(new Fiksi(JBaru));
					System.out.println("Buku berhasil ditambahkan");
					admin.liatBuku(daftarBuku);
				}else if(GBaru.equalsIgnoreCase("Non-Fiksi")) {
					daftarBuku.add(new Nonfiksi(JBaru));
					System.out.println("Buku berhasil ditambahkan");
					admin.liatBuku(daftarBuku);
				}
				break;
			}
			case 2: {
				System.out.println();
				admin.liatBuku(daftarBuku);
				break;
			}
			case 3: {
			    System.out.println();
			    System.out.print("Masukan judul Buku yang ingin dihapus: ");
			    String judulHapus = input.nextLine();
			    boolean bukuDitemukan = false;
			    for (Buku buku : daftarBuku) {
			        if (buku.judul.equalsIgnoreCase(judulHapus)) {
			            daftarBuku.remove(buku);
			            System.out.println("Buku berhasil dihapus.");
			            bukuDitemukan = true;
			        }
			    }
			    if (!bukuDitemukan) {
			        System.out.println("Buku tidak ditemukan.");
			    }
			    admin.liatBuku(daftarBuku);
			    break;
			}
			default:
				System.out.println("Menu yang anda pilih tidak tersedia.");
			}
		} else {
			System.out.println("Pengguna tidak terdaftar.");
		}
		
	}
}
