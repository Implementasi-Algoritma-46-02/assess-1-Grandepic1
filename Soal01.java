import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
		Scanner userInput = new Scanner(System.in);
		int bil1 = userInput.nextInt();
		int bil2 = userInput.nextInt();
		int bil3 = userInput.nextInt();
		int bil4 = userInput.nextInt();
		int bil5 = userInput.nextInt();

		System.out.println(identifikasi(bil1));
		System.out.println(identifikasi(bil2));
		System.out.println(identifikasi(bil3));
		System.out.println(identifikasi(bil4));
		System.out.println(identifikasi(bil5));
	}
	public static String identifikasi(int bilangan) {
		int k1 = bilangan/100;
		int k2 = bilangan/10%10;
		int k3 = bilangan%10;
		String valid = "";
		boolean cekSama = (k1!=k2)&&(k2!=k3)&&(k3!=k1);
		boolean cekBesar = (k1<k2)&&(k2<k3);
		boolean cekGanjil = (k3%2)==1;

		if (cekSama&&cekBesar&&cekGanjil) {
			valid = "valid";
		} else {
			valid = "tidak valid";
		}
		return String.format("%d %s",bilangan, valid);
	}
}
