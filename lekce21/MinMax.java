public class MinMax {
	public static void main(String[] args) throws java.io.IOException {
		java.io.FileReader r = new java.io.FileReader("cisla.txt");
		java.util.Scanner sc = new java.util.Scanner(r);
		int suma = 0;
		int min = 0;
		int max = 0;
		if (sc.hasNextInt()) {
			suma = sc.nextInt();
			min = suma;
			max = suma;
		}
		int cislo = 0;
		while (sc.hasNextInt()) {
			cislo = sc.nextInt();
			suma += cislo;
			if (cislo < min) {
				min = cislo;
			}
			if (cislo > max) {
				max = cislo;
			}
		}
		r.close();
		System.out.printf("Soucet cisel je: %d\n", suma);
		System.out.printf("Nejmensi cislo je: %d\n", min);
		System.out.printf("Nejvetsi cislo je: %d\n", max);
	}
}