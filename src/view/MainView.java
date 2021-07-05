package view;

import java.util.Scanner;



import dao.Session;
import dao.SignUpDAO;

public class MainView  {
    public MainView() {
    	Scanner sc = new Scanner(System.in);
    	SignUpDAO sdao = new SignUpDAO();
    	while(true) {
    		System.out.println("1.상품추가\n2.상품수정\n3.상품삭제\n4.내상품보기\n5.상품검색\n6.내정보수정\n7.로그아웃");
    		int choice = sc.nextInt();
    		if(choice == 7) {
    			System.out.println(Session.get("login_id")+"안녕히가세요.");
    			break;
    		}
    		switch(choice) {
    		case 1://상품추가
    			new AddBoardView();
    			break;
    		case 2 :
    			//상품수정
    			System.out.println(sdao.getList());
    			System.out.print("수정하실 상품번호:");
    			int prodnum = sc.nextInt();
    			
    			System.out.println("1.상품명수정\n2.상품가격수정\n3.상품재고수정\n4.상품설명수정");
    			int col = sc.nextInt();
    			sc = new Scanner(System.in);
    			System.out.print("새로운 데이터입력: ");
    			String newData = sc.nextLine();
    			if(pdao.updateProduct(prodnum,col,newData)) {
    				
    				System.out.println(prodnum+"번 상품수정완료!");
    			}else {
    				System.out.println("알수없는오류/다음에 다시 시도하세요.");
    			}
    			break;
    		case 3://상품삭제
    			System.out.println(sdao.getList());
    			System.out.print("삭제하실상품번호: ");
    		    prodnum = sc.nextInt();
    			if(sdao.removeSignUp(prodnum)) {
    				System.out.println(prodnum+"번 상품 삭제 완료!");
    			}else {
    				System.out.println("알수 없는 오류/다음에 다시 시도하세요");
    			}
    			break;
    		case 4://내상품보기
    			System.out.println("☆=========="+Session.get("login_id")+"님 상품목록============☆");
    			System.out.println(pdao.getList());
    			System.out.println("☆==============================☆");
    		    break;
    		case 5:
    			System.out.println("자세");
    		case 6:
    			
    		}
    	}
    }
}
