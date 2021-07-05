package view;

import java.util.Scanner;

import dao.AddBoardDAO;
import dao.Session;

import dto.BoardDTO;

public class AddBoardView {

	public AddBoardView() {

		Scanner sc = new Scanner(System.in);
		AddBoardDAO adao = new AddBoardDAO();
		
		System.out.print("글번호: ");
		int boardNum = sc.nextInt();
		System.out.print("글제목: ");
		String Title = sc.next();
		System.out.print("글내용: ");
		sc = new Scanner(System.in);
		String content = sc.nextLine();
		System.out.print("작성자: ");
		String conName = sc.next();
		System.out.print("날짜: ");
		int conDate = sc.nextInt();
		
		
		
		BoardDTO newBoard = new BoardDTO(boardNum,Title,content,,boardNum,Title,content,
                Session.get("login_id"));
		
		if(sdao.addBoard(newSignUp)) {
			System.out.println(name+"입력완료!");
		}else {
			System.out.println("알수없는오류/다음에 다시 시도하세요.");
		}
		
		
	}

}
