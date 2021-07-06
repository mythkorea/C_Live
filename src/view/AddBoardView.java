package view;

import java.util.Scanner;

import dao.AddBoardDAO;


import dto.BoardDTO;

public class AddBoardView {

	public AddBoardView() {

		Scanner sc = new Scanner(System.in);
		AddBoardDAO adao = new AddBoardDAO();
		
		System.out.print("글번호: ");
		int boardNum = sc.nextInt();
		System.out.print("글제목: ");
		String title = sc.next();
		System.out.print("글내용: ");
		sc = new Scanner(System.in);
		String content = sc.nextLine();
		System.out.print("작성자: ");
		String conName = sc.next();
		System.out.print("조회수: ");
		String viewCnt = sc.next();
		System.out.print("날짜: ");
		String conDate = sc.next();
		
	  
		
		
		BoardDTO newBoard = new BoardDTO(boardNum,title,content,conName,viewCnt,conDate);
		
		if(adao.addBoard(newBoard)) {
			System.out.println(content+"입력완료!");
		}else {
			System.out.println("알수없는오류/다음에 다시 시도하세요.");
		}
		
		
	}

}
