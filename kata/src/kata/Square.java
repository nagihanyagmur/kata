package kata;

public class Square {
	public  boolean isSquare(int n) {
		double sayi = Math.sqrt(n);
		int tamsayıhali = (int) sayi;
		double tekrardoubleçevirme = (double) tamsayıhali;
		if (sayi - tekrardoubleçevirme == 0) {
			return true;
		} else {
			return false;
		}
	}

}
