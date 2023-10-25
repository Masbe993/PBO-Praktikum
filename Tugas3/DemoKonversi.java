package Tugas3;

public class DemoKonversi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KonversiSuhu Konversi = new KonversiSuhu();
        KonversiSuhu2 Konversi2 = new KonversiSuhu2();

        double Celcius = 25.0;
        double Fahrenheit = Konversi.CelciusToFahrenheit(Celcius);
        double Reamur = Konversi.CelciusToReamur(Celcius);
        double FahrenheitToReamur = Konversi2.FahrenheitToReamur(Fahrenheit);

        System.out.println("Hasil Konversi Suhu:");
        System.out.println(Celcius + " Celsius       = " + Fahrenheit + " Fahrenheit");
        System.out.println(Celcius + " Celcius       = " + Reamur + " Reamur");
        System.out.println(Fahrenheit + " Fahrenheit    = " + FahrenheitToReamur + " Reamur");
	}

}