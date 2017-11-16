package kata;

public class BasicMathematicalOperations {
	public  Integer basicMath(String op, int v1, int v2) {
		int sonuc = 0;
		if (op == "+") {
			sonuc = v1 + v2;
		} else if (op == "-") {
			sonuc = v1 - v2;
		} else if (op == "*") {
			sonuc = v1 * v2;
		} else if (op == "/") {
			sonuc = v1 / v2;
		}
		return sonuc;

	}

}
