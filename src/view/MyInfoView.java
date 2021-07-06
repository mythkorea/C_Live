package view;

import java.util.Scanner;

import dao.MainDAO;

import dao.Session;

import dao.UserDAO;


public class MyInfoView {
	public MyInfoView() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		MainDAO mdao = new MainDAO();
		System.out.println("1. 비밀번호 수정\n2. 핸드폰번호 수정\n3. 주소 수정\n4. 회원탈퇴");
		int choice = sc.nextInt();
		if (choice == 4) {
			// 회원탈퇴
			if (mdao.deleteAll()) {
				if (udao.leaveId()) {
					System.out.println("회원 탈퇴 성공! 다시 돌아오세요");
					Session.put("login_id", null);
				} else {
					System.out.println("회원 탈퇴 실패 / 다음에 다시 시도하세요");
				}
			}
		} else {
			// 회원 정보 수정
			System.out.print("새로운 데이터 : ");
			sc = new Scanner(System.in);
			String newData = sc.nextLine();
			if (udao.updateUser(choice, newData)) {
				System.out.println("회원 정보 수정 완료!");
			} else {
				System.out.println("회원 정보 수정 실패 / 다음에 다시 시도하세요");
			}
		}
	}
}