package view;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		System.out.println("2021년 코로나 백신 프로그램");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 회원가입\n2.회원가입수정\n3.로그인\n4.나가기");
			int choice = sc.nextInt();
			
			//Controller
			
			if(choice == 4) {
				System.out.println("안녕히가세요");
				break;
			}
			switch(choice) {
			case 1:
				//회원가입
				//많은 데이터들의 입출력이 일어나기 때문에 코드가 길어진다.
				//따라서 새로운 View를 띄워준다.(흐름을 이동시킨다.)
				new JoinView();
				break;
			case 2:
				//회원가입수정
				new MyInfoView();
				break;
			case 3:
				//로그인
				new LoginView();
				break;
			
			}
		}
	}
}




