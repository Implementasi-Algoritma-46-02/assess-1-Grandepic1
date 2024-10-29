import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner userInput = new Scanner(System.in);
		String[] KodedanJam = userInput.nextLine().split(" ");
		String kode = KodedanJam[0];
		int jamSebulan = Integer.parseInt(KodedanJam[1]);
		System.out.println(cekKodeDanTunjanganHonor(kode, jamSebulan));

	}
	public static Double cekKodeDanTunjanganHonor(String kode, int jamSebulan) {
		double jumlahHonor = 30000*jamSebulan;
		switch (kode) {
			case "DES":
				jumlahHonor += 600000;
				break;
			case "PRG":
				jumlahHonor += 1200000;
				break;
			case "WRT":
				jumlahHonor += 400000;
				break;
			case "MKT":
				jumlahHonor += 500000;
				break;
			default:
				throw new AssertionError();
		}

		if (jamSebulan>=160&&jamSebulan<175){
			double bonus = 0.05*30000*jamSebulan;
			jumlahHonor += bonus;
		} else if (jamSebulan>=175){
			double bonus = 0.07*30000*jamSebulan;
			jumlahHonor += bonus;
		}
		return jumlahHonor;
	}
}
