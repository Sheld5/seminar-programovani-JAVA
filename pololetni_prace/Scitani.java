public class Scitani {
	public static void main(String[] args) {
		java.util.Random nahoda = new java.util.Random();
		System.out.println();
		for (int i = 0; i < 10; ) {
			int a = nahoda.nextInt(21);
			int b = nahoda.nextInt(21);
			if (a + b < 21) {
				System.out.printf("%d + %d = \n", a, b);
				i++;
			}
		}
	}
}