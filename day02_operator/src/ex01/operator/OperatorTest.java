/*
package ex01.operator;

public class OperatorTest {
	public static void main(String[] args) {
		//shift 연산자 : <<, >>, <<<, >>>
		int x = 8, result;
		
		//00001000 (8)--> 00100000 (32)
//		result = x << 2;	//left shift : 원래값 * 2^bit수 --> 8 * 2^2 = 32
//		System.out.println("left shift result :" + result); //32
		
		
		//00001000 (8) --> 00000001
		result = x >> 3;	//right shift : 원래값 / 2^bit수 --> 8 / 2^3 = 1
		System.out.println("left shift result : " + result); //
		
	}
}
*/
package ex01.operator;

public class OperatorTest {
	public static void main(String[] args) {
		//관계 연산자 : >, <, >=, <=, ==(같다), != (같지 않다)
	
		int x = 20, y = 21;
		
		if( x != y )
			System.out.println("같지 않다.");
		else
			System.out.println("같다.");
		
		if( x == y) System.out.println("같다.");
		else System.out.println("같지 않다.");
	}
}
