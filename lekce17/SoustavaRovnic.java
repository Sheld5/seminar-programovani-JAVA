public class SoustavaRovnic {

	public static int DelkaCisla(int cislo){
		int delkaCisla = 1;
      	while (cislo >= 10) {
			cislo /= 10;
      		delkaCisla++;
      	}
      	return delkaCisla;
	}

	public static void main(String[] args) {
		int pocetNeznamych = Integer.parseInt(args[0]);
		int matice[][] = new int[pocetNeznamych][pocetNeznamych + 1];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int radek = 0; radek < pocetNeznamych; radek++) {
			for (int sloupec = 0; sloupec < pocetNeznamych + 1; sloupec++) {
				matice[radek][sloupec] = sc.nextInt();
			}
		}

		for (int i = 1; i < pocetNeznamych; i++) {
			for (int radek = i; radek < pocetNeznamych; radek++) {
				for (int sloupec = i - 1; sloupec < pocetNeznamych + 1; sloupec++) {
					matice[radek][sloupec] = matice[i - 1][i - 1] * matice[radek][sloupec] - matice[radek][i - 1] * matice[i - 1][sloupec];
				}
			}
		}

		System.out.println();
		for (int radek = 0; radek < pocetNeznamych; radek++) {
			for (int sloupec = 0; sloupec < pocetNeznamych + 1; sloupec++) {
				if (sloupec == pocetNeznamych) {
					System.out.printf(" | %d", matice[radek][sloupec]);
				} else {
					System.out.printf(" %d", matice[radek][sloupec]);
				}
			}
			System.out.println();
		}
	}
}