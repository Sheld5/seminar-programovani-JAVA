public class OtoceniI {
	public static void main(String[] args) {
		int cisla[] = new int[100];

		System.out.printf("Zadej max. %d cisel:\n", cisla.length);

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int pocet = 0;
		for (int i = 0; i < cisla.length; i++) {
			if (sc.hasNextInt()) {
				cisla[i] = sc.nextInt();
			} else {
				break;
			}
			pocet++;
		}

		System.out.print("Opacne:\n");
		for (int i = pocet - 1; i >= 0; i--) {
			System.out.printf(" %d", cisla[i]);
		}
		System.out.println();
	}
}