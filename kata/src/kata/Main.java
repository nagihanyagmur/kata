package kata;

public class Main {

	public static void main(String[] args) {
		// TODO Nagi
		BasicMathematicalOperations bmo = new BasicMathematicalOperations();
		System.out.println("basicMath "+bmo.basicMath("+", 4, 7));
		System.out.println("basicMath "+bmo.basicMath("-", 15, 18));
		System.out.println("basicMath "+bmo.basicMath("*", 5, 5));
		System.out.println("basicMath "+bmo.basicMath("/", 49, 7));

		HighestandLowest hal = new HighestandLowest();
		System.out.println("HighAndLow "+hal.HighAndLow("1 2 3 4 5"));
		System.out.println("HighAndLow "+hal.HighAndLow("1 2 -3 4 5"));
		System.out.println("HighAndLow "+hal.HighAndLow("1 9 3 4 -5"));

		ConvertNumberString cns = new ConvertNumberString();
		System.out.println("ConvertNumberString "+cns.numberToString(123));
		System.out.println("ConvertNumberString "+cns.numberToString(999));

		Multiply m = new Multiply();
		System.out.println("Multiply "+m.multiply(2.3, 5.2));

		ShortestWord sw = new ShortestWord();
		System.out.println("findShort "+sw.findShort("bitcoin take over the world maybe who knows perhaps"));
		System.out.println("findShort "+sw.findShort("turns out random test cases are easier than writing out basic ones"));

		Solution s = new Solution();
		System.out.println("Solution "+s.solution(10));

		Square sq = new Square();
		System.out.println("Square "+sq.isSquare(-1));
		System.out.println("Square "+sq.isSquare(3));
		System.out.println("Square "+sq.isSquare(4));
		System.out.println("Square "+sq.isSquare(25));
		System.out.println("Square "+sq.isSquare(26));

		Same sm = new Same();
		String a1[] = { "hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz",
				"qqquuhii", "dvvvwz" };
		String a2[] = { "cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww" };
		System.out.println("Same "+sm.mxdiflg(a1, a2));

		durum d = new durum();
		int[] a = { 121, 144, 19, 161, 19, 144, 19, 11 };
		int[] b = { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };
		System.out.println("durum"+d.comp(a, b));

	}

}
