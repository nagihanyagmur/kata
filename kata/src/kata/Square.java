package kata;

public class Square {
	public  boolean isSquare(int n) {
		double sayi = Math.sqrt(n);
		int tamsay�hali = (int) sayi;
		double tekrardouble�evirme = (double) tamsay�hali;
		if (sayi - tekrardouble�evirme == 0) {
			return true;
		} else {
			return false;
		}
	}

}
