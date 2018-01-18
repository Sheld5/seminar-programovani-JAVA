public class Pascal {
	public static int[] zmenitVelikostListu(int list[], int velikost) {
		int newList[] = new int[velikost];
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		return newList;
	}
	public static void opakovatZnak(char znak, int pocet) {
      	while (pocet > 0) {
       	System.out.printf("%c", znak);
       	pocet--;
      	}
  	}
  	public static int nejvetsiCisloPascalovaTrojuhelniku(int vyska) {
  		int vysledek = 0;
  		int minulyRadek[] = new int[0];
  		for (int y = 0; y < vyska; y++) {
			minulyRadek = zmenitVelikostListu(minulyRadek, y + 1);

			int aktualniRadek[] = new int[y + 1];
			for (int x = 0; x <= y; x++) {
				if (y == vyska - 1 && x == (y + 1) / 2) {
					vysledek = minulyRadek[x - 1] + minulyRadek[x];
					aktualniRadek[x] = minulyRadek[x - 1] + minulyRadek[x];
				} else if (x == 0 || x == y) {
					aktualniRadek[x] = 1;
				} else {
					aktualniRadek[x] = minulyRadek[x - 1] + minulyRadek[x];
				}
			}
			for (int i = 0; i <= y; i++) {
				minulyRadek[i] = aktualniRadek[i];
			}
		}
		return vysledek;
  	}

	public static void main(String[] args) {
		int vyska = Integer.parseInt(args[0]);
		int minulyRadek[] = new int[0];

		int nejvetsiCislo = nejvetsiCisloPascalovaTrojuhelniku(vyska);
		int nejvetsiCisloI = nejvetsiCislo;
		int delkaNejvetsihoCisla = 1;
      	while (nejvetsiCisloI >= 10) {
      	nejvetsiCisloI /= 10;
      	delkaNejvetsihoCisla++;
      	}

		for (int y = 0; y < vyska; y++) {
			minulyRadek = zmenitVelikostListu(minulyRadek, y + 1);
			opakovatZnak(' ', delkaNejvetsihoCisla * (vyska - y - 1));

			int aktualniRadek[] = new int[y + 1];
			for (int x = 0; x <= y; x++) {
				int cislo = 1;
				if (x != 0 && x != y) {
					cislo = minulyRadek[x - 1] + minulyRadek[x];
				}
				int delkaCisla = 1;
      			while (cislo >= 10) {
      				cislo /= 10;
      				delkaCisla++;
      			}

				if (x == 0) {
					System.out.print("1");
					aktualniRadek[x] = 1;
				} else if (x == y) {
					opakovatZnak(' ', (2 * delkaNejvetsihoCisla) - delkaCisla);
					System.out.print("1");
					aktualniRadek[x] = 1;
				} else {
					opakovatZnak(' ', (2 * delkaNejvetsihoCisla) - delkaCisla);
					System.out.print(minulyRadek[x - 1] + minulyRadek[x]);
					aktualniRadek[x] = minulyRadek[x - 1] + minulyRadek[x];
				}
			}
			for (int i = 0; i <= y; i++) {
				minulyRadek[i] = aktualniRadek[i];
			}
			System.out.println();
		}
	}
}