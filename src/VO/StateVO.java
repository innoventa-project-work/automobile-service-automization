package VO;

import java.io.Serializable;

public class StateVO implements Serializable{
private int stateId;
private String stateName;
private String stateDescription;

CountryVO countryVO;
CountryVO cv = new CountryVO();

public CountryVO getCountryVO() {
	return countryVO;
}
public void setCountryVO(CountryVO countryVO) {
	this.countryVO = countryVO;
}
public CountryVO getCv() {
	return cv;
}
public void setCv(CountryVO cv) {
	this.cv = cv;
}
public int getStateId() {
	return stateId;
}
public void setStateId(int stateId) {
	this.stateId = stateId;
}
public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
public String getStateDescription() {
	return stateDescription;
}
public void setStateDescription(String stateDescription) {
	this.stateDescription = stateDescription;
}

}
