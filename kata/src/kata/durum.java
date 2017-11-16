package kata;

public class durum {

	public boolean comp(int[] a, int[] b) {
		int durum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i] * a[i] == b[j]) {

					durum = durum + 1;
					b[j]=-1;
					break;
				}

			}

		}
		if (durum == a.length) {
			return true;

		} else {
			return false;
		}
	}

}
