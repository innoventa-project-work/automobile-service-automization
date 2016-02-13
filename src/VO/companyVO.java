package VO;

import java.io.Serializable;

public class companyVO implements Serializable {
	private int comid;
	private String companyName,companyDescription;
	VehicleCategoryVO VehicleCategoryVO;
	VehicleCategoryVO vc = new VehicleCategoryVO();
	public int getComid() {
		return comid;
	}
	public void setComid(int comid) {
		this.comid = comid;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyDescription() {
		return companyDescription;
	}
	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}
	public VehicleCategoryVO getVehicleCategoryVO() {
		return VehicleCategoryVO;
	}
	public void setVehicleCategoryVO(VehicleCategoryVO vehicleCategoryVO) {
		VehicleCategoryVO = vehicleCategoryVO;
	}
	public VehicleCategoryVO getVc() {
		return vc;
	}
	public void setVc(VehicleCategoryVO vc) {
		this.vc = vc;
	}

}