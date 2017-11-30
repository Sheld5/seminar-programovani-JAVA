public class Kruh {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		for (int y = -r; y <= r; y++) {
			for (int x = -r; x <= r; x++) {
				if (x * x + y * y <= r * r) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}