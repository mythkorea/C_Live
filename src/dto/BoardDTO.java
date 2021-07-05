package dto;

public class BoardDTO {
    public int BoardNum;//글번호pk
    public String Title;//글제목
    public String Content;//글내용
    public String ConName;//작성자fk
    public String ViewCnt;//조회수
    public String ConDate;//날짜
    
	public BoardDTO(int boardNum, String title, String content, String conName, String viewCnt, String conDate) {
		super();
		this.BoardNum = boardNum;
		this.Title = title;
		this.Content = content;
		this.ConName = conName;
		this.ViewCnt = viewCnt;
		this.ConDate = conDate;
	}
	
    public String toString() {
		
		return BoardNum+"\t"+Title+"\t"+Content+"\t"+ConName+"\t"+ViewCnt+"\t"+ConDate;
	}
}
