public class Graf {
	public static void main(String[] args) {
		int hodnoty[] = new int[100];

		System.out.printf("Zadejte max. %d cisel:\n", hodnoty.length);

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int pocetHodnot = 0;
		for (int i = 0; i < hodnoty.length; i++) {
			if (sc.hasNextInt()) {
				hodnoty[i] = sc.nextInt();
			} else {
				break;
			}
			pocetHodnot++;
		}

		int max = 0;
		for (int i = 0; i < pocetHodnot; i++) {
			if (hodnoty[i] > max) {
				max = hodnoty[i];
			}
		}

		System.out.println();
		for (int i = 0; i < pocetHodnot; i++) {
			System.out.printf("%d:", i + 1);

			double delka = (double)hodnoty[i] * 60 / max + 0.5;

			for (int o = 0; o < (int)delka; o++) {
				System.out.printf("X");
			}
			System.out.println();
		}
	}
}