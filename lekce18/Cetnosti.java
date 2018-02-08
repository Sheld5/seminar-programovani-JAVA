public class Cetnosti {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.util.Map<Integer, Integer> m = new java.util.HashMap<>();
		while (sc.hasNextInt()) {
			int cislo = sc.nextInt();
			if (m.get(cislo) == null) {
				m.put(cislo, 1);
			} else {
				m.put(cislo, m.get(cislo) + 1);
			}
		}
		for (Integer cislo : m.keySet()) {
			System.out.printf("%dx %d\n", m.get(cislo), cislo);
		}
	}
}