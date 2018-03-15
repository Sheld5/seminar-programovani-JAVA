public class Nasobky {
	public static void main(String[] args) throws java.io.IOException {
		java.io.PrintWriter pw = new java.io.PrintWriter("nasobky.txt");
		int step = 3;
		int max = 1000;
		int count = 0;
		for (int i = 0; i < max; i += step) {
			if (count < 10) {
				count++;
			} else {
				pw.println();
				count = 0;
			}
			if (i > max - step) {
				pw.printf("%d", i);
			} else {
				pw.printf("%d,", i);
			}
		}
		pw.close();
	}
}