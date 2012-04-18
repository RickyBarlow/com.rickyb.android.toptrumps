package TopTrumpsMcs;

public class TTmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("hi from main ;-)");
		toptrumps TT = new toptrumps();
		// TT.toString();
		for (int i = 0; i < 100; i++) {
			i = i + (i * 2);
			System.out.println(i);
		}
		try {
			dbtest dbtest = new dbtest();
			dbtest.iterate();
			// dbtest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// dbtest.iterate();
	}

}
