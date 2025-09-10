package week02.adhityo.id.ac.umn;

import java.util.Scanner;

public class soal3 {

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukan nilai terkecil: ");
		int min = scanner.nextInt();
		System.out.print("Masukan nilai terbesar: ");
		int max = scanner.nextInt();
		int sum = 0;

		for (int i = min; i <= max; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}

		System.out.println("Jumlah dari semua nilai prima dari " + min + " sampai " + max + " adalah " + sum);
		scanner.close();
	}
}