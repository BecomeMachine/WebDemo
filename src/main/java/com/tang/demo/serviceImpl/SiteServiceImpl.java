/**
 * 
 */
package com.tang.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tang.demo.dao.SiteDao;
import com.tang.demo.model.Site;
import com.tang.demo.service.SiteService;

/**
 * @author tangwei
 * @CreateDate 2018-07-17
 */
@Service("siteServiceImpl")
public class SiteServiceImpl implements SiteService {

	@Autowired
	private SiteDao siteDaoImpl;
	/* (non-Javadoc)
	 * @see com.tang.demo.service.SiteService#getSiteByID(java.lang.Long)
	 */
	@Override
	public Site getSiteByID(Long siteID) {
		// TODO Auto-generated method stub
		return siteDaoImpl.getSiteByID(siteID);
	}

	/* (non-Javadoc)
	 * @see com.tang.demo.service.SiteService#getSiteListBySaleRegionID(java.lang.Long)
	 */
	@Override
	public List<Site> getSiteListBySaleRegionID(Long saleRegionID) {
		// TODO Auto-generated method stub
		return siteDaoImpl.getSiteListBySaleRegionID(saleRegionID);
	}

}
