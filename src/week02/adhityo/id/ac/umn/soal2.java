package week02.adhityo.id.ac.umn;

import java.util.Scanner;

public class soal2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukan angka: ");
		int angka = scanner.nextInt();
		boolean isPrime = true;

		if (angka <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(angka); i++) {
				if (angka % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println("Angka " + angka + " adalah angka prima");
		} else {
			System.out.println("Angka " + angka + " adalah bukan angka prima");
		}
		scanner.close();
	}
}