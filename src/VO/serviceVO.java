package VO;

import java.io.Serializable;

public class serviceVO implements Serializable{
private int serviceId;
private String serviceName,serviceDescription;
VehicleCategoryVO vc = new VehicleCategoryVO();
public String getServiceName() {
	return serviceName;
}
public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}
public int getServiceId() {
	return serviceId;
}
public void setServiceId(int serviceId) {
	this.serviceId = serviceId;
}
public String getServiceDescription() {
	return serviceDescription;
}
public void setServiceDescription(String serviceDescription) {
	this.serviceDescription = serviceDescription;
}

public VehicleCategoryVO getVc() {
	return vc;
}
public void setVc(VehicleCategoryVO vc) {
	this.vc = vc;
}

}
