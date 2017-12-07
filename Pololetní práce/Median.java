import java.util.Arrays;

public class Median {
	public static double[] ZvetsitVelikostListu(double list[]) {
		double newList[] = new double[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		return newList;
	}

	public static void main (String[] args) {
		double cisla[] = new double[0];
		int pocet = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while (sc.hasNextDouble()) {
			cisla = ZvetsitVelikostListu(cisla);
			cisla[pocet] = sc.nextDouble();
			pocet++;
		}

		if (pocet == 0) {
			System.out.println("Nebyla zadana zadna cisla!");
		} else {
			Arrays.sort(cisla);

			if (pocet % 2 == 0) {
				System.out.printf("Median je: %.2f\n", (cisla[pocet / 2 - 1] + cisla[pocet / 2]) / 2);
			} else {
				System.out.printf("Median je: %.2f\n", cisla[pocet / 2]);
			}
		}
	}
}