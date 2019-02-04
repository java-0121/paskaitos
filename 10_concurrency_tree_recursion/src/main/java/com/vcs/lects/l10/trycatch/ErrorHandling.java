package com.vcs.lects.l10.trycatch;

public class ErrorHandling {

	public static void main(String[] args) {

		ErrorHandling e = new ErrorHandling();
		System.out.println(e.metodas1(2));

	}

	public double metodas1(int i) {
		return metodas2(i);
	}

	private double metodas2(int i) {

		try {
			i -= 2;

			return metodas3(i);

		} catch (ArithmeticException e) {

			// Niekada nepalikti tuscio bloko
			System.err.println("I vyko klaida grazinsiu 0: 45 /  " + i + " msg: " + e.getMessage());

		} catch (NullPointerException e) {

			// Niekada nepalikti tuscio bloko
			System.err.println("null'as " + i + " msg: " + e);

		} catch (Exception e) {
			System.err.println("checkable exception");
			
			return 1;
		} finally {
			System.out.println(" visad");
		}

		System.out.println("as grazinu nuli");
		
		return 0;

		// return metodas3(i);

	}

	private double metodas3(int i) throws Exception {

		// Integer d = null;
		// d.intValue();

		if (i == 0) {
			throw new Exception("Bus dalyba is nulio, todel nedalinsiu :)");
		}

		return 45 / i;
	}

}
