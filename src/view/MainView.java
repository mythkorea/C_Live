package view;

import java.util.ArrayList;
import java.util.Scanner;

import dao.MainDAO;
import dao.Session;

public class MainView {
	public MainView() {
		Scanner sc = new Scanner(System.in);
		MainDAO mdao = new MainDAO();
		while(true) {
			if(Session.get("login_id") == null) {
				break;
			}
			System.out.println("1.지역번호 추가\n2. 지역이름수정\n3. 삭제\n4. 선별소이름보기\n5. 선별소주소 검색\n6. 선별소 전화번수정\n7. 백신 보유수\n8.로그아웃");
			int choice = sc.nextInt();
			if(choice == 8) {
				System.out.println(Session.get("login_id")+"님 안녕히가세요.");
				break;
			}
			switch(choice) {
			case 1:
				//지역번호추가
				new AddAreaView();
				break;
				
			case 2:
				//지역이름수정
				System.out.println(mdao.getList());
				System.out.print("수정하실 글 번호 : ");
				int mainnum = sc.nextInt();
				System.out.println("1.글제목  수정\n2.작성자  수정\n3.삭제\n4. 글내용 수정\n5.날짜");
				int col = sc.nextInt();
				sc = new Scanner(System.in);
				System.out.print("새로운 데이터 입력 : ");
				String newData = sc.nextLine();
				if(mdao.updateProduct(mainnum,col,newData)) {
					System.out.println(mainnum+"번 글 수정 완료!");
				}else {
					System.out.println("알 수 없는 오류 / 다음에 다시 시도하세요.");
				}
				break;
			case 3:
				//글삭제
				System.out.println(mdao.getList());
				System.out.print("삭제하실 글 번호 : ");
				mainnum = sc.nextInt();
				if(mdao.removeMain(mainnum)) {
					System.out.println(mainnum+"번 글 삭제 완료!");
				}else {
					System.out.println("알 수 없는 오류 / 다음에 다시 시도하세요.");
				}
				break;
			case 4://글내용
				System.out.println("☆======="+Session.get("login_id")+"님 글목록=======☆");
				System.out.println(mdao.getList());
				System.out.println("☆===================================☆");
				break;
			case 5://날짜
				
				new AddBoardView();
				break;
			
			}
			
		}
	}
}











