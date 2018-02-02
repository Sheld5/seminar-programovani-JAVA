public class Test {
	public static int[] method(int x, int y) {
		int vysledek[] = new int[2];
		vysledek[0] = x;
		vysledek[1] = y + 1;
		return vysledek;
	}

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int z[] = method(x, y);
		System.out.print(z[0]);
		System.out.print(z[1]);
	}
}