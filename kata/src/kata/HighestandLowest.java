package kata;

public class HighestandLowest {
	public  String HighAndLow(String numbers) {

		String dizi[] = numbers.split(" ");
		int max = Integer.parseInt(dizi[0]);
		for (int t = 1; t < dizi.length; t++) {
			if (Integer.parseInt(dizi[t]) > max) {
				max = Integer.parseInt(dizi[t]);
			}
		}

		int min = Integer.parseInt(dizi[0]);
		for (int a = 1; a < dizi.length; a++) {
			if (Integer.parseInt(dizi[a]) < min) {
				min = Integer.parseInt(dizi[a]);
			}
		}
		String max2 = Integer.toString(max);
		String min2 = Integer.toString(min);
		String sonuc = max2 + " " + min2;

		return sonuc;
	}

}
