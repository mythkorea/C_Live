package dto;

public class AreaDTO {
    public int AreaId;//지역번호pk,fk
    public String AreaName;//지역이름
    public String AreaLink;//게시판링크
    public String AreaInf;//선별소이름
    public String AreaInfAddr;//선별소 주소
    public String AreaInfNum;//선별소 전화번호
    public String AreaVac;//백신 보유수
    
	public AreaDTO(int areaId, String areaName, String areaLink, String areaInf, String areaInfAddr, String areaInfNum,
			String areaVac) {
		super();
		this.AreaId = areaId;
		this.AreaName = areaName;
		this.AreaLink = areaLink;
		this.AreaInf = areaInf;
		this.AreaInfAddr = areaInfAddr;
		this.AreaInfNum = areaInfNum;
		this.AreaVac = areaVac;
	}
    public String toString() {
		
		return AreaId+"\t"+AreaName+"\t"+AreaLink+
		"\t"+AreaInf+"\t"+AreaInfAddr+"\t"+AreaInfNum+"\t"+AreaVac;
	}
}
