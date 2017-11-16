package kata;

public class ShortestWord {
	public  int findShort(String s) {
		String dizi[] = s.split(" ");
		int min = dizi[0].length();
		for (int a = 1; a < dizi.length; a++) {
			if (dizi[a].length() < min) {
				min = dizi[a].length();
			}
		}
		return min;

	}

}
