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

		for (int radek = 1; radek < pocetNeznamych - 1; radek++) {
			for (int sloupec = 0; sloupec < pocetNeznamych; sloupec++) {
				matice[radek][sloupec] = matice[radek][sloupec] * matice[radek + 1][0] - matice[radek + 1][sloupec] * matice[radek][0];
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