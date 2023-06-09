/*
package ex01.operator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//단항연산자 : 증감연산자 --> ++, -- (1 증가, 1 감소), ~
		
		
		int x = 10, y; //지역변수 ( 초기화 필수)
		y = x++; //후위 연산 , 대입 먼저 실행한 후 연산
		System.out.println("x = " + x + "\t y = " +y);
		
		int xx = 10, yy; //지역변수 ( 초기화 필수)
		yy = ++xx; //전위 연산 , 연산 먼저 실행한 후 나중 대입
		System.out.println("xx = " + xx + "\t yy = " + yy);
	}
}*/
/*
package ex01.operator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {

		int x = 10, y;
		
		y = ~x; 	// 비트 부정 : -(원래값 + 1) --> 출력 결과
							//	 -(10 + 1) : -11
		System.out.println("x = " + x + "\t y = " + y);
	}
}
*/

package ex01.operator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//산술연산자 : +, -, *, /, %, ^ ...
		int x = 10, y = 20;
		int gob = x * y;
		
		System.out.println(gob);
		System.out.println("x * y = " + (x*y));	
		System.out.println(x + " * " + y + " = " + (x*y));
		System.out.println("___________________________");
		
		System.out.println("3+4*5 = "+ (3+4*5)); 	//23
		System.out.println("(3+4)*5 = "+ ( (3+4)*5  ));//35
		
		System.out.println("\n\n7/3 = " + (7 / 3));	//몫
		System.out.println("7%3 = " + (7 % 3));		//나머지
		//정수끼리의 연산에서는 정수만 취한다. 몫만 출력
		//정수 (+, -, *, /, %, ^...) 정수 = 정수
		
		System.out.println("\n7 / 3 = " + (7 / 3));		//2	
		System.out.println("7 / 3.0 = " + (7 / 3.0));	//2.3333
		
		
		
		
	}
}