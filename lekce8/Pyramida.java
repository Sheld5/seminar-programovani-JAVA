/* Nakresli (krasnou) pyramidu. */
public class Pyramida {
	public static void main(String[] args) {
		int vyska = Integer.parseInt(args[0]);
		
		for (int y = 1; y <= vyska; y++) {
			for (int x = 1; x <= vyska - y; x++) {
				System.out.printf(" ");
			}
			for (int x = 1; x < y * 2; x++) {
				System.out.printf("X");
			}
			System.out.println();
		}
	}
}
