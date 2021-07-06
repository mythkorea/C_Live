package view;

import java.util.Scanner;

import dao.AreaDAO;


import dto.AreaDTO;

public class AddAreaView {
	public AddAreaView() {
		Scanner sc = new Scanner(System.in);
		AreaDAO adao = new AreaDAO();
		
		
		System.out.print("지역id: ");
		int areaId = sc.nextInt();
	    System.out.print("지역이름: ");
	    String areaName = sc.next();
	    System.out.print("게시판링크: ");
	    String areaLink = sc.next();
	    System.out.print("선별소이름: ");
	    String areaInf = sc.next();
	    System.out.print("선별소주소: ");
	    String areaInfAddr = sc.next();
	    System.out.print("선별소전화번호: ");
	    String areaInfNum = sc.next();
	    System.out.print("백신보유수: ");
	    int areaVac = sc.nextInt();
	    AreaDTO newArea = new AreaDTO(
	    		areaId,
	    		areaName,
	    		areaLink,
	    		areaInf,
	    		areaInfAddr,
	    		areaInfNum,
	    		areaVac
            );
	}
}
