package ex_02.datatype;

public class MainEntry {
	
	static int Num;  //정수형: 0, 실수형:0.0, 문자열: null값이 들어간다.
	static String str;
	
	public static void main(String[] args) {
		
		int y = 0; 
		//지역변수는 반드시 초기화하고 사용한다.
		System.out.println(y);
		
		
		System.out.println("static value :" +",  + str");
		int su = 30;
		System.out.println(su);    //4byte int 형
		System.out.println(100);   //4
		
		long num = 20;
		System.out.println(num);   //8byte
		System.out.println(1000);  //4
		System.out.println(1000L); //접미사에 의한 long형 8byte
	
		double d = 12.34;
		System.out.println(d);		//
		System.out.println(34.56);  //정밀도가 더 뛰어난 double
		System.out.println(12.34f); //float형
		
		float f = 12.34f;
		System.out.println(f);
		
	}
}
