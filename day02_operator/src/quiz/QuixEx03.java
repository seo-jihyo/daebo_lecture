package quiz;

import java.util.Scanner;

public class QuixEx03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요: ");
		String name = sc.next();
		System.out.print("번호를 입력해 주세요: ");
		String phone = sc.next();
		System.out.println("입력받은 이름: " + name);
		System.out.println("입력받은 번호: " + phone);

		
	}
}
//이름, 주소, 연락처를 입력받아서 출력하기