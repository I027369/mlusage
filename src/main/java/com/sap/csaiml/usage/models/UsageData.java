package com.sap.csaiml.usage.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class UsageData {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="id", unique=true)
	private long id;
	
	private String clientID;

	private String envName;

	private String tenantID;

	private String userName;
	
	private String userType;

	private String applicationType;

	private String modelType;

	private String eventType;
	
	@Column(columnDefinition="NVARCHAR(700)")
	private String apiEndpoint;

	@Column(columnDefinition="NVARCHAR(500)")
	private String apiShortName;

	private String responseCode;

	private Timestamp apiRequestTimestamp;
	
	private long apiTotalCallDuration;

	private long apiServerCallDuration;
	
	private long apiDBCallDuration;

	private long apiExtCallDuration;

	private String latitude;

	private String longitude;
	
	private int interaction;

	@Column(columnDefinition="NVARCHAR(500)")
	private String deviceType;

	@Column(columnDefinition="NVARCHAR(500)")
	private String browser;
	
	@Column(columnDefinition="NVARCHAR(500)")
	private String os;
	
	@Column(columnDefinition="NVARCHAR(700)")
	private String userAgent;
	
	
	
	public UsageData() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UsageData(long id, String clientID, String envName, String tenantID, String userName, String userType,
			String applicationType, String modelType, String eventType, String apiEndpoint, String apiShortName,
			String responseCode, Timestamp apiRequestTimestamp, long apiTotalCallDuration, long apiServerCallDuration,
			long apiDBCallDuration, long apiExtCallDuration, String latitude, String longitude, int interaction,
			String deviceType, String browser, String os, String userAgent) {
		super();
		this.id = id;
		this.clientID = clientID;
		this.envName = envName;
		this.tenantID = tenantID;
		this.userName = userName;
		this.userType = userType;
		this.applicationType = applicationType;
		this.modelType = modelType;
		this.eventType = eventType;
		this.apiEndpoint = apiEndpoint;
		this.apiShortName = apiShortName;
		this.responseCode = responseCode;
		this.apiRequestTimestamp = apiRequestTimestamp;
		this.apiTotalCallDuration = apiTotalCallDuration;
		this.apiServerCallDuration = apiServerCallDuration;
		this.apiDBCallDuration = apiDBCallDuration;
		this.apiExtCallDuration = apiExtCallDuration;
		this.latitude = latitude;
		this.longitude = longitude;
		this.interaction = interaction;
		this.deviceType = deviceType;
		this.browser = browser;
		this.os = os;
		this.userAgent = userAgent;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getClientID() {
		return clientID;
	}



	public void setClientID(String clientID) {
		this.clientID = clientID;
	}



	public String getEnvName() {
		return envName;
	}



	public void setEnvName(String envName) {
		this.envName = envName;
	}



	public String getTenantID() {
		return tenantID;
	}



	public void setTenantID(String tenantID) {
		this.tenantID = tenantID;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}



	public String getApplicationType() {
		return applicationType;
	}



	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}



	public String getModelType() {
		return modelType;
	}



	public void setModelType(String modelType) {
		this.modelType = modelType;
	}



	public String getEventType() {
		return eventType;
	}



	public void setEventType(String eventType) {
		this.eventType = eventType;
	}



	public String getApiEndpoint() {
		return apiEndpoint;
	}



	public void setApiEndpoint(String apiEndpoint) {
		this.apiEndpoint = apiEndpoint;
	}



	public String getApiShortName() {
		return apiShortName;
	}



	public void setApiShortName(String apiShortName) {
		this.apiShortName = apiShortName;
	}



	public String getResponseCode() {
		return responseCode;
	}



	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}



	public Timestamp getApiRequestTimestamp() {
		return apiRequestTimestamp;
	}



	public void setApiRequestTimestamp(Timestamp apiRequestTimestamp) {
		this.apiRequestTimestamp = apiRequestTimestamp;
	}



	public long getApiTotalCallDuration() {
		return apiTotalCallDuration;
	}



	public void setApiTotalCallDuration(long apiTotalCallDuration) {
		this.apiTotalCallDuration = apiTotalCallDuration;
	}



	public long getApiServerCallDuration() {
		return apiServerCallDuration;
	}



	public void setApiServerCallDuration(long apiServerCallDuration) {
		this.apiServerCallDuration = apiServerCallDuration;
	}



	public long getApiDBCallDuration() {
		return apiDBCallDuration;
	}



	public void setApiDBCallDuration(long apiDBCallDuration) {
		this.apiDBCallDuration = apiDBCallDuration;
	}



	public long getApiExtCallDuration() {
		return apiExtCallDuration;
	}



	public void setApiExtCallDuration(long apiExtCallDuration) {
		this.apiExtCallDuration = apiExtCallDuration;
	}



	public String getLatitude() {
		return latitude;
	}



	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}



	public String getLongitude() {
		return longitude;
	}



	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}



	public int getInteraction() {
		return interaction;
	}



	public void setInteraction(int interaction) {
		this.interaction = interaction;
	}



	public String getDeviceType() {
		return deviceType;
	}



	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}



	public String getBrowser() {
		return browser;
	}



	public void setBrowser(String browser) {
		this.browser = browser;
	}



	public String getOs() {
		return os;
	}



	public void setOs(String os) {
		this.os = os;
	}



	public String getUserAgent() {
		return userAgent;
	}



	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}



	@Override
	public String toString() {
		return "UsageData [id=" + id + ", clientID=" + clientID + ", envName=" + envName + ", tenantID=" + tenantID
				+ ", userName=" + userName + ", userType=" + userType + ", applicationType=" + applicationType
				+ ", modelType=" + modelType + ", eventType=" + eventType + ", apiEndpoint=" + apiEndpoint
				+ ", apiShortName=" + apiShortName + ", responseCode=" + responseCode + ", apiRequestTimestamp="
				+ apiRequestTimestamp + ", apiTotalCallDuration=" + apiTotalCallDuration + ", apiServerCallDuration="
				+ apiServerCallDuration + ", apiDBCallDuration=" + apiDBCallDuration + ", apiExtCallDuration="
				+ apiExtCallDuration + ", latitude=" + latitude + ", longitude=" + longitude + ", interaction="
				+ interaction + ", deviceType=" + deviceType + ", browser=" + browser + ", os=" + os + ", userAgent="
				+ userAgent + "]";
	}

	
	
	
}
