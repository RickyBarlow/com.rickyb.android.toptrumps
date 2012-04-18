package TopTrumpsMcs;

//TODO  may need to make serialisable 
//?? how??
public class trumpcard {
	// public void trumpcard(String a, String b, int c, int d, int e){
	// }
	int cNum; // Card Number
	String cName; // Card Name
	String f1n;
	int f1v; // Field 1 Name; Field 1 Value
	String f2n;
	int f2v;
	String f3n;
	int f3v;
	String f4n;
	int f4v;

	public trumpcard(int cNum, String cName, String f1n, int f1v, String f2n,
			int f2v, String f3n, int f3v, String f4n, int f4v) {
		super();
		this.cNum = cNum;
		this.cName = cName;
		this.f1n = f1n;
		this.f1v = f1v;
		this.f2n = f2n;
		this.f2v = f2v;
		this.f3n = f3n;
		this.f3v = f3v;
		this.f4n = f4n;
		this.f4v = f4v;
	}

	public int getcNum() {
		return cNum;
	}

	public String getcName() {
		return cName;
	}

	public String getF1n() {
		return f1n;
	}

	public int getF1v() {
		return f1v;
	}

	public String getF2n() {
		return f2n;
	}

	public int getF2v() {
		return f2v;
	}

	public String getF3n() {
		return f3n;
	}

	public int getF3v() {
		return f3v;
	}

	public String getF4n() {
		return f4n;
	}

	public int getF4v() {
		return f4v;
	}

	@Override
	public String toString() {
		return "trumpcard [cNum=" + cNum + ", cName=" + cName + ", f1n=" + f1n
				+ ", f1v=" + f1v + ", f2n=" + f2n + ", f2v=" + f2v + ", f3n="
				+ f3n + ", f3v=" + f3v + ", f4n=" + f4n + ", f4v=" + f4v + "]";
	}

}
