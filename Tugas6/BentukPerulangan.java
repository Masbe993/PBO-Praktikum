package Tugas6;
import java.util.Scanner;
public class BentukPerulangan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("1. Bilangan Prima");
		System.out.println("2. Bilangan Ganjil Genap");
		System.out.println("3. Huruf Z-A");
		System.out.println("4. Lirik Lagu 'Anak Ayam Turun 10'");
		System.out.print("Perulangan apa yang ingin anda lihat: ");
		int pil = input.nextInt();
		switch (pil) {
		case 1: {
			System.out.println();
			System.out.println("Bilangan Prima 0-20:");
			for (int i=0; i<=20; i++){
	            int bil=0;
	            for (int j=1;j<=i;j++){
	                if (i%j==0){
	                    bil=bil+1;
	                }
	            }
	            if (bil==2){
	                System.out.print(i+" ");
	            }
			}
			break;
		}
		case 2: {
			System.out.println();
			System.out.println("Ganjil 0-20: ");
			for(int i=0; i<=20; i++) {
				if(i%2==1) {
					System.out.print(i+" ");
				}
			}
			System.out.println("\nGenap 0-20: ");
			for(int i=0; i<=20; i++) {
				if(i%2==0) {
					System.out.print(i+" ");
				}
			}
			break;
		}
		case 3: {
			System.out.println();
			System.out.println("Huruf Z-A:");
			for(char i='Z'; i>='A'; i--) {
				System.out.print(i+" ");
			}
			break;
		}
		case 4: {
			int j = 10;
			for(int i=1; i<=j; i++) {
				int sisa= j-i;
				System.out.println("\nTek kotek, kotek kotek");
				System.out.println("Anak ayam turunlah berkotek");
				System.out.println("Anak ayam turunlah "+i);
				System.out.println("Mati satu tinggalah "+sisa);
			}
			break;
		}
		default:
			System.out.println("\nPilihan Yang Anda Masukan salah");
		}
	}

}
