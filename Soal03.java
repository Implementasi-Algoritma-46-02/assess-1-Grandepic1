import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner userInput = new Scanner(System.in);
		int jam = userInput.nextInt();
		int menit = userInput.nextInt();
		int penambahanMenit = userInput.nextInt();
		System.out.println(penjumlahanJam(jam, menit, penambahanMenit));
	}

	public static String penjumlahanJam(int jamSekarang, int menitSekarang, int menitYangDijumlahkan) {
		int rumusMenit = menitSekarang+menitYangDijumlahkan;
		int hasilmenit = rumusMenit;
		int penambahanJam = 0;
		if (rumusMenit>59) {
			penambahanJam = rumusMenit/60;
			hasilmenit = rumusMenit-((rumusMenit/60)*60);
		}
		int jumlahJam = jamSekarang+penambahanJam;
		String teksJam = ""+jumlahJam;
		if (jumlahJam<10) {
			teksJam = "0"+jumlahJam;
		}
		return String.format("%s:%d",teksJam ,hasilmenit);

	}
}
