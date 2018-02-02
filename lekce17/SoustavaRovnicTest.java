public static void printMatice(int pocetNeznamych, int matice[][]) {
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

public static int[] delkaNejdelsihoCislaMatice(int pocetNeznamych, int matice[][]) {
	int vysledek[] = new int[2]; //vysledek[1] je delka nejdelsiho cisla; (vysledek[0] = 0) => nejdelsi cislo je kladne; (vysledek[0] = 1) => nejdelsi cislo je zaporne
	for (int radek = 0; radek < pocetNeznamych; radek++) {
		for (int sloupec = 0; sloupec < pocetNeznamych + 1; sloupec++) {
			if (delkaCisla(matice[radek][sloupec]) > vysledek[1]) {
				vysledek[1] = delkaCisla(matice[radek][sloupec]);
				if (matice[radek][sloupec] < 0) {
					vysledek[0] = 1;
				} else {
					vysledek[0] = 0;
				}
			} else if (delkaCisla(matice[radek][sloupec]) == vysledek[1] && matice[radek][sloupec] < 0) {
				vysledek[0] = 1;
			}
		}
	}
	return vysledek;
}

public static int delkaCisla(int cislo) {
	int delka = 1;
	while (cislo >= 10) {
		cislo /= 10;
		delka++;
	}
	return delka;
}