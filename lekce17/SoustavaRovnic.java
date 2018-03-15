public class SoustavaRovnic {
	public static void main(String[] args) {

		int pocetNeznamych = Integer.parseInt(args[0]);
		int matice[][] = new int[pocetNeznamych][pocetNeznamych + 1];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int radek = 0; radek < pocetNeznamych; radek++) {
			for (int sloupec = 0; sloupec < pocetNeznamych + 1; sloupec++) {
				matice[radek][sloupec] = sc.nextInt();
			}
		}

		for (int i = 0; i < pocetNeznamych - 1; i++) {
			for (int radek = i + 1; radek < pocetNeznamych; radek++) {
				int prvniCisloVRadku = matice[radek][i];
				for (int sloupec = i; sloupec < pocetNeznamych + 1; sloupec++) {
					matice[radek][sloupec] = matice[i][i] * matice[radek][sloupec] - prvniCisloVRadku * matice[i][sloupec];
				}
			}
		}

		double vysledky[] = new double[pocetNeznamych];
		for (int radek = pocetNeznamych - 1; radek >= 0; radek--) {
			vysledky[radek] = (double) matice[radek][pocetNeznamych];
			for (int sloupec = pocetNeznamych - 1; sloupec > radek; sloupec--) {
				vysledky[radek] -= (double) matice[radek][sloupec] * vysledky[sloupec];
			}
			vysledky[radek] /= (double) matice[radek][radek];
		}

		boolean zapornyVysledek = false;
		for (int i = 0; i < pocetNeznamych; i++) {
			if (vysledky[i] < 0) {
				zapornyVysledek = true;
			}
		}
		if (zapornyVysledek) {
			for (int i = 0; i < pocetNeznamych; i++) {
				if (vysledky[i] < 0) {
					System.out.printf("\n x%d = %.2f", i + 1, vysledky[i]);
				} else {
					System.out.printf("\n x%d =  %.2f", i + 1, vysledky[i]);
				}
			}
		} else {
			for (int i = 0; i < pocetNeznamych; i++) {
			System.out.printf("\n x%d = %.2f", i + 1, vysledky[i]);
			}
		}
		System.out.println();

	}
}