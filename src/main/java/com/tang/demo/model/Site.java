/**
 * 
 */
package com.tang.demo.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Repository;

/**
 * @author tangwei
 * @createDate 2018-07-17
 */
@Repository("site")
public class Site {

	private Long siteID = null;
	private String siteName = null;
	private Long projectID = null;
	private String projectNo = null;
	private String sort = null;
	private int validStatus = 0;
	private Timestamp createTime = null;
	private Timestamp lastUpateTime = null;
	private Long createUser = null;
	private int saleRegionID = 0;
	private String siteNO = null;
	private int isAvailable = 0;
	
	public Site() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Site(Long siteID, String siteName, Long projectID, String projectNo, String sort, int validStatus,
			Timestamp createTime, Timestamp lastUpateTime, Long createUser, int saleRegionID, String siteNO,
			int isAvailable) {
		super();
		this.siteID = siteID;
		this.siteName = siteName;
		this.projectID = projectID;
		this.projectNo = projectNo;
		this.sort = sort;
		this.validStatus = validStatus;
		this.createTime = createTime;
		this.lastUpateTime = lastUpateTime;
		this.createUser = createUser;
		this.saleRegionID = saleRegionID;
		this.siteNO = siteNO;
		this.isAvailable = isAvailable;
	}
	public Long getSiteID() {
		return siteID;
	}
	public void setSiteID(Long siteID) {
		this.siteID = siteID;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public Long getProjectID() {
		return projectID;
	}
	public void setProjectID(Long projectID) {
		this.projectID = projectID;
	}
	public String getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public int getValidStatus() {
		return validStatus;
	}
	public void setValidStatus(int validStatus) {
		this.validStatus = validStatus;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getLastUpateTime() {
		return lastUpateTime;
	}
	public void setLastUpateTime(Timestamp lastUpateTime) {
		this.lastUpateTime = lastUpateTime;
	}
	public Long getCreateUser() {
		return createUser;
	}
	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}
	public int getSaleRegionID() {
		return saleRegionID;
	}
	public void setSaleRegionID(int saleRegionID) {
		this.saleRegionID = saleRegionID;
	}
	public String getSiteNO() {
		return siteNO;
	}
	public void setSiteNO(String siteNO) {
		this.siteNO = siteNO;
	}
	public int getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(int isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Site [siteID=" + siteID + ", siteName=" + siteName + ", projectID=" + projectID + ", projectNo="
				+ projectNo + ", sort=" + sort + ", validStatus=" + validStatus + ", createTime=" + createTime
				+ ", lastUpateTime=" + lastUpateTime + ", createUser=" + createUser + ", saleRegionID=" + saleRegionID
				+ ", siteNO=" + siteNO + ", isAvailable=" + isAvailable + "]";
	}
	
	
	
}
