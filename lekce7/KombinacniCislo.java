public class KombinacniCislo {

	public static int faktorial(int x) {
		int f = 1;
		for (int i = 1; i <= x; i++) {
			f = f * i;
		}
		return f;
	}

	public static void main(String args[]) {
		int k = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[0]);

		int kc = faktorial(n) / (faktorial(n - k) * faktorial(k));
		System.out.printf("%d\n", kc);
	}
}