package UTS;

import java.util.Scanner;
public class HewanBeraksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Kucing kucing = new Kucing(null);
		Anjing anjing = new Anjing(null);
		System.out.print("Masukan jenis hewan: ");
		String hewan = input.nextLine();
		if(hewan.equalsIgnoreCase("Kucing")) {
			kucing.bersuara();
		}else if (hewan.equalsIgnoreCase("Anjing")) {
			anjing.bersuara();
		}else {
			System.out.println("mohon maaf Jenis hewan ini tidak dikenal.");
		}
		
		System.out.print("\nApakah anda Ingin mencoba melihat hewan ini jenis apa? (Y/N): ");
		String pil = input.nextLine();
		if (pil.equalsIgnoreCase("Y")) {
			if(hewan.equalsIgnoreCase("Kucing")) {
				kucing.jenis();
			} else if (hewan.equalsIgnoreCase("Anjing")) {
				anjing.jenis();
			}else {
				System.out.println("hewan ini bukan Mamalia.");
			}
		} else if(pil.equalsIgnoreCase("N")){
			System.out.println(".");
		}else {
			System.out.println("maaf tuan Pilihan yang anda masukan salah.");
		}
	}

}
