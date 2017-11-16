package kata;

public class Main {

	public static void main(String[] args) {
		// TODO Nagi
		BasicMathematicalOperations bmo=new BasicMathematicalOperations();
		System.out.println(bmo.basicMath("+",4,7));
		System.out.println(bmo.basicMath("-", 15, 18));
		System.out.println(bmo.basicMath("*", 5, 5));
		System.out.println(bmo.basicMath("/", 49, 7));
		
		HighestandLowest hal=new HighestandLowest();
		System.out.println(hal.HighAndLow("1 2 3 4 5"));
		System.out.println(hal.HighAndLow("1 2 -3 4 5"));
		System.out.println(hal.HighAndLow("1 9 3 4 -5"));
		
		ConvertNumberString cns=new ConvertNumberString();
		System.out.println(cns.numberToString(123));
		System.out.println(cns.numberToString(999));
	
		Multiply m=new Multiply();
		System.out.println(m.multiply(2.3, 5.2));
		
		ShortestWord sw=new ShortestWord();
		System.out.println(sw.findShort("bitcoin take over the world maybe who knows perhaps"));
		System.out.println(sw.findShort("turns out random test cases are easier than writing out basic ones"));
		
		Solution s=new Solution();
		System.out.println(s.solution(10));
		
		Square sq=new Square();
		System.out.println(sq.isSquare(-1));
		System.out.println(sq.isSquare(3));
		System.out.println(sq.isSquare(4));
		System.out.println(sq.isSquare(25));
		System.out.println(sq.isSquare(26));
		
		
		
		

	}

}
