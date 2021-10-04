package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.println("*********************************************************");
		System.out.print("[ ");
		for (int heltall : tabell) {

			System.out.print(heltall + " ");

		}
		System.out.println("]");
		System.out.println();
		System.out.println("*********************************************************");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String nyStreng = "[";
		if (tabell.length >= 1) {

			for (int i = 0; i < tabell.length - 1; i++) {
				nyStreng = nyStreng + tabell[i] + ",";
			}
			nyStreng = nyStreng + tabell[tabell.length - 1];
			nyStreng = nyStreng + "]";

			return nyStreng;
		} else {
			nyStreng = "[]";
			return nyStreng;
		}

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int tall : tabell) {
			sum += tall;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;
		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall) {
				funnet = true;
			}
			i++;
		}

		return funnet;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int returVerdi = -1;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				returVerdi = i;
				break;
			}
		}
		return returVerdi;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
