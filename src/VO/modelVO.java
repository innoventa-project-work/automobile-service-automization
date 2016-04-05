package VO;

public class modelVO {
	private int modelid;
	private String modelName,modelDescription;
	companyVO companyVO;
	VehicleCategoryVO  vcVO;
	
	public companyVO getCompanyVO() {
		return companyVO;
	}
	public void setCompanyVO(companyVO companyVO) {
		this.companyVO = companyVO;
	}
	public VehicleCategoryVO getVcVO() {
		return vcVO;
	}
	public void setVcVO(VehicleCategoryVO vcVO) {
		this.vcVO = vcVO;
	}
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
}
