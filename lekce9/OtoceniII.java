public class OtoceniII {
	public static int[] ZvetsitVelikostListu(int list[]) {
		int newList[] = new int[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		return newList;
	}

	public static void main(String[] args) {
		int cisla[] = new int[0];

		System.out.printf("Zadej cisla:\n");

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int pocet = 0;
		while (sc.hasNextInt()) {
			if (pocet < cisla.length){
				cisla[pocet] = sc.nextInt();
			} else {
				cisla = ZvetsitVelikostListu(cisla);
				cisla[pocet] = sc.nextInt();
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