package dto;

public class BoardDTO {
    public int boardNum;//글번호pk
    public String title;//글제목
    public String content;//글내용
    public String conName;//작성자fk
    public int viewCnt;//조회수
    public String conDate;//날짜
    
    public BoardDTO(int boardNum, String title, String content, String conName, String viewCnt, String conDate) {
        super();
        this.boardNum = boardNum;
        this.title = title;
        this.content = content;
        this.conName = conName;
        this.viewCnt = 0;
        this.conDate = conDate;
    }

    public String toString() {
        return boardNum+"\t"+title+"\t"+content+"\t"+conName+"\t"+viewCnt+"\t"+conDate;
    }
}
