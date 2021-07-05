package view;

import java.util.Scanner;

import dao.SignUpDAO;
import dao.UserDAO;
import dto.SignUpDTO;
import dto.UserDTO;

public class JoinView {
	public JoinView() {
		//회원가입이 진행되었다는 뜻은 회원의 정보를 담아둘 DB에 실제 데이터들이 저장되었다는 뜻이다.
		//따라서 가입을 진행하려면 데이터베이스에 접근이 필요하고 그 기능들을 구현해놓은 DAO가 필요하다.
		//"회원정보"에 접근할 DAO이기 때문에 UserDAO로 만들어 놓는다.
		UserDAO udao = new UserDAO();
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		if (udao.checkDup(id)) {
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("핸드폰 번호 : ");
			String phonenum = sc.next();
			
			
			System.out.print("성별 : ");
			sc = new Scanner(System.in);
			String gender = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("주소 : ");
			sc = new Scanner(System.in);
			String addr = sc.nextLine();
			System.out.print("이메일 : ");
			
			sc = new Scanner(System.in);
			String email = sc.next();
			
			//여기까지 왔다면 회원 가입에 필요한 모든 정보를 입력받았다는 뜻이다. 따라서 UserTable에 이 모든 정보들을
			//저장해 주어야 한다. 저장하는 기능적인 코드들은 View단에서 구현하는것이 아니고 데이터에 접근하기 위한
			//DAO에 구현해 놓는다. 그리고 그 메소드를 View단에서 호출하는 식으로 사용한다.
			//호출시 넘겨주어야 할 값이 따로따로 있으면 손상이 일어날 수 있기 때문에 하나의 객체로 포장해서 넘겨주는것이 좋다.
			//그 때 사용하는것이 DTO객체이고 "유저정보"들을 포장한 객체이기 때문에 UserDTO로 만들어 놓는다.
			UserDTO newUser = new UserDTO(id,pw,name,phonenum,gender,age,addr,email);
			
			if (udao.join(newUser)) {
				System.out.println("회원가입 성공!");
				System.out.println(name + "님 가입을 환영합니다~");
			} else {
				System.out.println("회원가입 실패 / 다시 시도해 주세요.");
			}
		} else {
			System.out.println("중복된 아이디가 있습니다. 다시 시도해 주세요.");
		}
	}
}






