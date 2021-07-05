package view;

import java.util.Scanner;

import dao.Session;
import dao.SignUpDAO;

public class LoginView {
	public LoginView() {
		Scanner sc = new Scanner(System.in);
		SignUpDAO sdao = new SignUpDAO();
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		if(sdao.login(id,pw)) {
			System.out.println(id+"님 어서오세요.");
			Session.put("login_id",id);
			//메인창
			new MainView();
		}else {
			System.out.println("로그인 실패 / 다시 시도해 주세요.");
		}
	}
}











