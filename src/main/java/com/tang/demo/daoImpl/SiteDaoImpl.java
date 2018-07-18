/**
 * 
 */
package com.tang.demo.daoImpl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.tang.demo.dao.SiteDao;
import com.tang.demo.model.Site;

/**
 * @author tangwei
 * @createDate 2018-07-17
 */
@Repository("siteDaoImpl")
public class SiteDaoImpl implements SiteDao {

	private static final Logger logger = Logger.getLogger(SiteDao.class.getName());
	private static SqlSession session = null;
	static {
		try {
			String config = "SqlMapConfig.xml";
			// 使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
			InputStream is = SiteDaoImpl.class.getClassLoader().getResourceAsStream(config);
			// 构建sqlSession的工厂
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
			session = sessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tang.demo.dao.SiteDao#getSiteByID(java.lang.Long)
	 */
	@Override
	public Site getSiteByID(Long siteID) {
		// TODO Auto-generated method stub
		Site site = null;
		try {		
			SiteDao mapper = session.getMapper(SiteDao.class);			
			site = mapper.getSiteByID(siteID);
			session.commit();
			if (session != null) {
				session.close();
		     }

		} catch (Exception e) {
			e.printStackTrace();
		}
		return site;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tang.demo.dao.SiteDao#getSiteListBySaleRegionID(java.lang.Long)
	 */
	@Override
	public List<Site> getSiteListBySaleRegionID(Long saleRegionID) {
		// TODO Auto-generated method stub
		List<Site> siteList = new ArrayList<Site>();
		try {
			SiteDao mapper = session.getMapper(SiteDao.class);	
			siteList = mapper.getSiteListBySaleRegionID(saleRegionID);
			session.commit();
			for (Site site : siteList) {
				logger.info("------" +  site.toString() + "------");
			}
			if (session != null) {
				session.close();
		     }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return siteList;
	}

}
