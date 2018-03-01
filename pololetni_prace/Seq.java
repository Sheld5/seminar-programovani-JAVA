import java.util.Arrays;

public class Seq {
	public static void main(String[] args) {
		int start = 0;
		int krok = 0;
		int stop = 0;
		String oddelovac = " ";

		if (args[0].equals("-s")) {
			if (args.length == 1) {
				System.out.print("error");
				return;
			}
			oddelovac = args[1];
			args = Arrays.copyOfRange(args, 2, args.length);
		}

		if (args.length == 1) {
			stop = Integer.parseInt(args[0]);
		} else if (args.length == 2) {
			start = Integer.parseInt(args[0]);
			stop = Integer.parseInt(args[1]);
		} else if (args.length == 3) {
			start = Integer.parseInt(args[0]);
			krok = Integer.parseInt(args[1]);
			stop = Integer.parseInt(args[2]);
		}

		if (krok == 0) {
			// Nic
		} else if (krok > 0) {
			System.out.println();
			System.out.print(" ");
			for (int i = start; i <= stop; i += krok) {
				System.out.print(i);
				if (i + krok <= stop) {
					System.out.print(oddelovac);
				}
			}
			System.out.println();
			System.out.print(" ");
		} else {
			System.out.println();
			for (int i = start; i >= stop; i += krok) {
				System.out.print(i);
				if (i + krok >= stop) {
					System.out.print(oddelovac);
				}
			}
			System.out.println();
		}
	}
}