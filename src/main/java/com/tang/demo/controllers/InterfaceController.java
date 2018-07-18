/**
 * 
 */
package com.tang.demo.controllers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tang.demo.bean.Elevator;
import com.tang.demo.model.Site;
import com.tang.demo.service.SiteService;



/**
 * @author tang
 * @createDate 2018/7/16
 * @version test
 */
@Controller
@RequestMapping(value = "/dataDispatch")
public class InterfaceController {
	
	private final static Logger logger = Logger.getLogger(InterfaceController.class.getName());
    @Autowired 
    private SiteService siteServiceImpl;
	/**
	 * test connect
	 */
	@RequestMapping(value = "/accessSystemData")
	public void accessSystemData() {
		logger.info("----------accessSystemData---------------");
		Site site = siteServiceImpl.getSiteByID(3125312L);
		List<Site> siteList = siteServiceImpl.getSiteListBySaleRegionID(35L);
		logger.info("-------" + site.toString() + "-----");
		logger.info("-------" + siteList.toString() + "-----");
		
	}
	
	/**
	 * test return , using @RequestParam
	 * @param operateType
	 * @return
	 */
	@RequestMapping(value = "/getReturnUsedRequestParam", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> getReturnRequestParam(@RequestParam String operateType) {
		Map<String, Object> myMap = new HashMap<String, Object>();
		logger.info("----------get operateType: " + operateType + "----------");
		myMap.put("getReturn", "return info");
		logger.info("----------return systemData: " + myMap.toString() + "----------");
		return myMap;
	}

	/**
	 * test return , using @RequestBody
	 * @param operateType
	 * @return
	 */
	@RequestMapping(value = "/getReturnUsedRequestBody", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> getReturn(@RequestBody Elevator e) {
		Map<String, Object> myMap = new HashMap<String, Object>();
		myMap.put("getReturn", "return info");
		logger.info("----------return systemData: " + e.toString() + "----------");
		return myMap;
	}
	
	
	/**
	 * test default params HttpServletRequest
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "defaultServletRequestParams", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> defaultServletRequestParams(HttpServletRequest request) {
		logger.info("---------------use request data---------------------");
		Map<String, Object> myMap = new HashMap<String, Object>();
		String elevatorID = request.getParameter("elevatorID");
	    String elevatorName = request.getParameter("elevatorName");
	    logger.info("--------elevatorID: " + elevatorID + "----elevatorName: " + elevatorName + "-----------");
		myMap.put("defaultServletRequestParams", elevatorID + elevatorName);
		return myMap;
	}
     
	/**
	 * test return  string data of elevator
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getElevatorString/{principal}", method = RequestMethod.POST)
    @ResponseBody public String getElevatorString(@PathVariable String principal, 
    											  @RequestParam String elevatorID,
    											  @RequestParam String elevatorName) {
        Elevator elevator = new Elevator(Long.valueOf(elevatorID), elevatorName, principal);
        logger.info("------genarate elevator : " + elevator.toString() + "------");
        return elevator.toString();
    }
	
	/**
	 * test return  Object data of elevator
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getElevatorObject/{principal}", method = RequestMethod.GET)
    @ResponseBody public Elevator getElevatorObject(@PathVariable String principal, 
    											  @RequestParam String elevatorID,
    											  @RequestParam String elevatorName) {
        Elevator elevator = new Elevator(Long.valueOf(elevatorID), elevatorName, principal);
        
        logger.info("------genarate elevator : " + elevator.toString() + "------");
        return elevator;
    }
	
	/**
	 * test return  Object data of elevator
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getElevatorObjectList/{principal}", method = RequestMethod.GET)
    @ResponseBody public List<Elevator> getElevatorObjectList(@PathVariable String principal, 
    											  @RequestParam String elevatorID,
    											  @RequestParam String elevatorName) {
        Elevator elevator1 = new Elevator(Long.valueOf(elevatorID), elevatorName, principal);
        Elevator elevator2 = new Elevator(Long.valueOf(elevatorID) + 1L, elevatorName + "2", principal);
        List<Elevator> elevatorList = new ArrayList<Elevator>();
        elevatorList.add(elevator1); 
        elevatorList.add(elevator2);
        logger.info("------genarate elevatorList : " + elevatorList.toString() + "------");
        return elevatorList;
    }
	

}
