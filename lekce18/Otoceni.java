public class Otoceni {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.util.List<Integer> l = new java.util.ArrayList<>();
		while (sc.hasNextInt()) {
			l.add(sc.nextInt());
		}
		System.out.println();
		for (int i = l.size() - 1; i >= 0; i--) {
			System.out.printf("%d ", l.get(i));
		}
		System.out.println();
	}
}