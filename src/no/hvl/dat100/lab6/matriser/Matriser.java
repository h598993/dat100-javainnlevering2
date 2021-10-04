package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int rad[] : matrise) {
			for (int element : rad) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String returStreng = "";

		for (int i = 0; i < matrise.length; i++) {
			int[] rad = matrise[i];
			for (int k = 0; k < rad.length; k++) {
				returStreng += rad[k] + " ";
			}
			returStreng += "\n";
		}
		return returStreng;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][];

		for (int rad = 0; rad < matrise.length; rad++) {

			// legger til lengden på raden slik at den blir dynamisk
			nyMatrise[rad] = new int[matrise[rad].length];

			for (int element = 0; element < matrise[rad].length; element++) {
				nyMatrise[rad][element] = matrise[rad][element] * tall;
			}
		}

		return nyMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean erLik = true;
		// sjekker om lengden er lik først
		if (a.length == b.length) {

			for (int r = 0; r < a.length; r++) {

				for (int k = 0; k < a[r].length; k++) {
					if (a[r][k] != b[r][k]) {
						erLik = false;
						return erLik;
					}
				}
			}
		} else {
			erLik = false;
		}
		return erLik;
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		// returnerer en ny matrise som er vridd 90 grader mot klokken i stedet for å
		// spile.
		int[][] nyMatrise = new int[matrise.length][matrise.length];

		for (int r = 0; r < matrise.length; r++) {
			for (int k = 0; k < matrise[r].length; k++) {
				nyMatrise[r][k] = matrise[r][k];
			}
		}

		for (int r = 0; r < nyMatrise.length; r++) {
			for (int k = 0; k < nyMatrise.length; k++) {
				nyMatrise[(matrise.length - 1) - k][r] = matrise[r][k];
			}
		}

		return nyMatrise;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
