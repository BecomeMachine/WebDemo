/**
 * 
 */
package com.tang.demo.ModelMapper;

import java.util.List;

import com.tang.demo.model.Site;

/**
 * @author tangwei
 * @createDate 2018-07-17
 */
public interface SiteMapper {

	public Site getSiteByID(Long siteID);
	
	//public List<Site> getSiteListBySaleRegionID(Long saleRegionID);
	
}
