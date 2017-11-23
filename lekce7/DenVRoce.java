public class DenVRoce {
	public static boolean jePrestupny(int rok) {
		if (rok % 4 == 0) {
			if (rok % 100 == 0) {
				if (rok % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int den = Integer.parseInt(args[0]);
		int mesic = Integer.parseInt(args[1]);
		int rok = Integer.parseInt(args[2]);

		int dnuVMesici = 0;
		if (mesic == 1 || mesic == 3 || mesic == 5 || mesic == 7 || mesic == 8 || mesic == 10 || mesic == 12) {
			dnuVMesici = 31;
		} else if (mesic == 2) {
			if (jePrestupny(rok)) {
				dnuVMesici = 29;
			} else {
				dnuVMesici = 28;
			}
		} else {
			dnuVMesici = 30;
		}

		if (mesic > 0 && mesic < 13 && den > 0 && den <= dnuVMesici) {
			int x = 0;
			for (int i = 1; i < mesic; i++) {
				x += 30;
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
					x += 1;
				}
				if (i == 2) {
					if (jePrestupny(rok)) {
						x -= 1;
					} else {
						x -= 2;
					}
				}
			}
			x += den;
			System.out.printf("%d\n", x);
		} else {
			System.out.printf("Zadane datum neexistuje!");
		}
	}
}