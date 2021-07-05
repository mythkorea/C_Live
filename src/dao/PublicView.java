package dao;
    
    import java.util.Scanner;
	import dao.ProductDAO;
import dto.BoardDTO;
import dto.ProductDTO;

	//공익신고
	public class PublicView{
		public PublicView() {
			Scanner sc = new Scanner(System.in);
			MainDAO pdao = new MainDAO();
			System.out.print("거리두기 미시행: ");
			String prodname = sc.next();
			System.out.print("마스크 착용: ");
			int prodprice = sc.nextInt();
			System.out.print("지역 보건소 연계: ");
			int prodamount = sc.nextInt();
			
			String prodinfo = sc.nextLine();
			BoardDTO newProduct = new BoardDTO(0,prodname,prodprice,
					                prodamount,prodinfo,Session.get("login_id"));
			if(pdao.addProduct(newProduct)) {
				System.out.println(prodname+"상품추가완료!");
			}else {
				System.out.println("알수없는오류/다음에 다시 시도하세요.");
			}
			
			
		}

	}

}
