/**
 * 
 */
package com.tang.demo.dao;

import java.util.List;

import com.tang.demo.model.Site;

/**
 * @author tangwei
 * @CreateDate 2018-07-17
 */
public interface SiteDao {

	public Site getSiteByID(Long siteID);
	
	public List<Site> getSiteListBySaleRegionID(Long saleRegionID);
}
