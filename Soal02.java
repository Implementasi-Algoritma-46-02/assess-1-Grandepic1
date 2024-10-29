import java.util.Scanner;

public class Soal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner userInput = new Scanner(System.in);
		String[] StudidanIPK = userInput.nextLine().split(" ");
		String[] StatusLain = userInput.nextLine().split(" ");
		double masaStudi = Double.parseDouble(StudidanIPK[0]);
		double IPK = Double.parseDouble(StudidanIPK[1]);
		int EPRT = Integer.parseInt(StatusLain[0]);
		String HKI = StatusLain[1];
		String Lomba = StatusLain[2];
		System.out.println(cekCumlaude(masaStudi, IPK, EPRT, HKI, Lomba));
	}
	public static String cekCumlaude(double masaStudi, double IPK, int EPRT, String HKI, String Lomba) {
		String status = "";
		boolean cekMasaStudi = masaStudi >= 3.0;
		boolean cekIPK = IPK >= 3.5;
		boolean cekEprt = EPRT>=450;
		boolean cekHKI = HKI.equals("ada");
		boolean cekLomba = Lomba.equals("ada");
		if (cekMasaStudi&&cekIPK&&cekEprt&&cekHKI&&cekLomba) {
			status = "Cumlaude";
		} else {
			status = "Tidak cumlaude";
		}
		return status;
	}
}
