package VO;

import java.io.Serializable;

public class areaVO implements Serializable{
private int areaID;
private String areaName,areaDescription;
cityVO cityVO;
cityVO cv = new cityVO();
public int getAreaID() {
	return areaID;
}
public void setAreaID(int areaID) {
	this.areaID = areaID;
}
public String getAreaName() {
	return areaName;
}
public void setAreaName(String areaName) {
	this.areaName = areaName;
}
public String getAreaDescription() {
	return areaDescription;
}
public void setAreaDescription(String areaDescription) {
	this.areaDescription = areaDescription;
}
public cityVO getCityVO() {
	return cityVO;
}
public void setCityVO(cityVO cityVO) {
	this.cityVO = cityVO;
}
public cityVO getCv() {
	return cv;
}
public void setCv(cityVO cv) {
	this.cv = cv;
}

}
