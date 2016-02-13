package VO;

public class modelVO {
	private int modelid;
	private String modelName,modelDescription;
	companyVO companyVO;
	companyVO cv = new VO.companyVO();
	public int getModelid() {
		return modelid;
	}
	public void setModelid(int modelid) {
		this.modelid = modelid;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelDescription() {
		return modelDescription;
	}
	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}
	public companyVO getCompanyVO() {
		return companyVO;
	}
	public void setCompanyVO(companyVO companyVO) {
		this.companyVO = companyVO;
	}
	public companyVO getCv() {
		return cv;
	}
	public void setCv(companyVO cv) {
		this.cv = cv;
	}
	

}
