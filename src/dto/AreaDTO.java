package dto;

public class AreaDTO {
    public int areaId;//지역번호pk,fk
    public String areaName;//지역이름
    public String areaLink;//게시판링크
    public String areaInf;//선별소이름
    public String areaInfAddr;//선별소 주소
    public String areaInfNum;//선별소 전화번호
    public int areaVac;//백신 보유수
    
	public AreaDTO(
			int areaId,
			String areaName,
			String areaLink,
			String areaInf,
			String areaInfAddr,
			String areaInfNum,
			int areaVac
	) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
		this.areaLink = areaLink;
		this.areaInf = areaInf;
		this.areaInfAddr = areaInfAddr;
		this.areaInfNum = areaInfNum;
		this.areaVac = areaVac;
	}
    public String toString() {
		
		return areaId+"\t"+areaName+"\t"+areaLink+
		"\t"+areaInf+"\t"+areaInfAddr+"\t"+areaInfNum+"\t"+areaVac;
	}
}
