public class Elipsa {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		for (int y = -b; y <= b; y++){
			for (int x = -a; x <= a; x++) {
				if ((x * x * b * b) + (y * y * a * a) < a * a * b * b) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}