public class Vlnovka {
	public static void main(String[] args) {
		int vyska = Integer.parseInt(args[0]);
		int delka = Integer.parseInt(args[1]);

		if (vyska < 1 || delka < 1) {
			System.out.print("Parametry vlnovky nesmi byt mensi nez 1!");
		} else {
			for (int i = 0; i < vyska; i++) {
				for (int o = 0; o < delka; o++) {
					if (o % (vyska * 2 - 2) == i || o % (vyska * 2 - 2) == (vyska * 2 - 2) - i) {
						System.out.print("X");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}	
	}
}