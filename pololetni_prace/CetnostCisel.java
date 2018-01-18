import java.util.Arrays;

public class CetnostCisel {
	public static int[] ZvetsitVelikostListu(int list[]) {
		int newList[] = new int[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		return newList;
	}

	public static void main(String[] args) {
		int cisla[] = new int[0];
		int pocet = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while (sc.hasNextInt()) {
			cisla = ZvetsitVelikostListu(cisla);
			cisla[pocet] = sc.nextInt();
			pocet++;
		}
		Arrays.sort(cisla);

		int minuleCislo = 0;
		int cetnostMinulehoCisla = 0;
		int pocetRuznych = 0;
		int cislaRuzna[] = new int[0];
		int cetnostiCisel[] = new int[0];

		for (int i = 0; i < cisla.length; i++) {
			if (i == 0) {
				minuleCislo = cisla[i];
				cetnostMinulehoCisla = 1;
			} else if (cisla[i] == minuleCislo) {
				cetnostMinulehoCisla++;
			} else {
				cislaRuzna = ZvetsitVelikostListu(cislaRuzna);
				cetnostiCisel = ZvetsitVelikostListu(cetnostiCisel);
				if (pocetRuznych == 0) {
					cislaRuzna[pocetRuznych] = minuleCislo;
					cetnostiCisel[pocetRuznych] = cetnostMinulehoCisla;
				} else if (cetnostMinulehoCisla <= cetnostiCisel[pocetRuznych - 1]) {
					cislaRuzna[pocetRuznych] = minuleCislo;
					cetnostiCisel[pocetRuznych] = cetnostMinulehoCisla;
				} else {
					for (int o = 0; (pocetRuznych - 1 - o >= 0) && (cetnostMinulehoCisla > cetnostiCisel[pocetRuznych - 1 - o]); o++) {
						cislaRuzna[pocetRuznych - o] = cislaRuzna[pocetRuznych - 1 - o];
						cetnostiCisel[pocetRuznych - o] = cetnostiCisel[pocetRuznych - 1 - o];
						cislaRuzna[pocetRuznych - 1 - o] = minuleCislo;
						cetnostiCisel[pocetRuznych - 1 - o] = cetnostMinulehoCisla;
					}
				}
				minuleCislo = cisla[i];
				cetnostMinulehoCisla = 1;
				pocetRuznych++;
			}
		}
		cislaRuzna = ZvetsitVelikostListu(cislaRuzna);
		cetnostiCisel = ZvetsitVelikostListu(cetnostiCisel);
		if (cetnostMinulehoCisla <= cetnostiCisel[pocetRuznych - 1]) {
			cislaRuzna[pocetRuznych] = minuleCislo;
			cetnostiCisel[pocetRuznych] = cetnostMinulehoCisla;
		} else {
			for (int o = 0; (pocetRuznych - 1 - o >= 0) && (cetnostMinulehoCisla > cetnostiCisel[pocetRuznych - 1 - o]); o++) {
				cislaRuzna[pocetRuznych - o] = cislaRuzna[pocetRuznych - 1 - o];
				cetnostiCisel[pocetRuznych - o] = cetnostiCisel[pocetRuznych - 1 - o];
				cislaRuzna[pocetRuznych - 1 - o] = minuleCislo;
				cetnostiCisel[pocetRuznych - 1 - o] = cetnostMinulehoCisla;
			}
		}

		for (int i = 0; i < cislaRuzna.length; i++) {
			if ((i == 0) || (cetnostiCisel[i] != cetnostiCisel[i - 1])) {
				System.out.println();
			}
			System.out.printf("%dx %d\n", cetnostiCisel[i], cislaRuzna[i]);	
		}
	}
}