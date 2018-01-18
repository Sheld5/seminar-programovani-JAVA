public class Pi {
	public static void main(String[] args) {
		int r = 1024;
		double bodyCtverce = 0;
		double bodyKruhu = 0;
		for (int y = -r; y <= r; y++) {
			for (int x = -r; x <= r; x++) {
				if (x * x + y * y <= r * r) {
					bodyKruhu++;
				}
				bodyCtverce++;
			}
		}

		double vysledek = bodyKruhu / bodyCtverce;
		System.out.println(vysledek);
	}
}