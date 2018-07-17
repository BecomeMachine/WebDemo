/**
 * 
 */
package com.tang.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tang.demo.bean.Elevator;

/**
 * @author tangwei
 * @createDate 2018-07-16
 */

@Controller
@RequestMapping(value = "/pageDispatch")
public class PageController {
	private final static Logger logger = Logger.getLogger(PageController.class.getName());
	
	
	/**
	 * test index page
	 * @param null
	 * @return
	 */
	@RequestMapping(value = "/myIndex",method = RequestMethod.GET)
    public String index(){
		logger.info("-----get myIndex----------");
        return "myIndex";
    }
	
	/**
	 * test redirect page
	 * @param null
	 * @return
	 */
	@RequestMapping(value = "/staticPage",method = RequestMethod.GET)
    public String redirect(){
        return "redirect:/views/staticPage.html";
    }
	 
	/**
	 * test return page with ModelAndView , and method addObject
	 * @param int size, int old, HttpServletReqeust request
	 * @return
	 */
	@RequestMapping(value = "mediaInfoWithAddObject", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	public ModelAndView mediaInfo(
			@RequestParam(defaultValue = "0") int count,
			@RequestParam(defaultValue = "1") int size,
			HttpServletRequest request) {
		logger.info("---------------get mediaInfo.jsp---------------------");
		ModelAndView modelAndView = new ModelAndView("mediaInfo");
		modelAndView.addObject("count", count + 1);
		modelAndView.addObject("size", size + 1);
		
		return modelAndView;
	}
	
	/**
	 * test return page with ModelAndView, and using modelMap   for custom object
	 * @param int size, int old, HttpServletReqeust request
	 * @return
	 */
	@RequestMapping(value = "elevatorPageInfoWithModeMap", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	public ModelAndView elevatorInfo(
			@RequestParam(defaultValue = "0") Long elevatorID,
			@RequestParam(defaultValue = "unname") String elevatorName,
			HttpServletRequest request) {
		logger.info("---------------get elevatorPageInfo.jsp , WithModeMap---------------------");
		
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("elevator", new Elevator(elevatorID + 1L, elevatorName + "1"));
		ModelAndView modelAndView = new ModelAndView("elevatorPageInfo", modelMap);
		
		
		return modelAndView;
	}
	
	/**
	 * test return page with ModelAndView, and using hashMap   for custom object
	 * @param int size, int old, HttpServletReqeust request
	 * @return
	 */
	@RequestMapping(value = "elevatorPageInfoWithHashMap", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	public ModelAndView elevatorPageInfo(
			@RequestParam(defaultValue = "0") Long elevatorID,
			@RequestParam(defaultValue = "unname") String elevatorName,
			HttpServletRequest request) {
		logger.info("---------------get elevatorPageInfo.jsp, WithHashMap---------------------");
		
		Map<String, Elevator> map = new HashMap<String, Elevator>();
		map.put("elevator", new Elevator(elevatorID + 2L, elevatorName + "2"));
		ModelAndView modelAndView = new ModelAndView("elevatorPageInfo", map);	
		
		return modelAndView;
	}
	
	/**
	 * test return page
	 * @param int size, int old, RedirectAttributes attr
	 * @return
	 */
	@RequestMapping("mediaInfoRedirectAttributes.shtml")
	public String mediaInfoRedirectAttributes(
			@RequestParam(defaultValue = "0") int size,
			@RequestParam(defaultValue = "1") int old,
			RedirectAttributes attr) {
		logger.info("---------------get mediaInfoRedirectAttributes.shtml---------------------");
		attr.addFlashAttribute("size", size);
		attr.addFlashAttribute("old", old);
		return "redirect:/viewDemo/mediaInfoRedirectAttributes.shtml";
	}
	
	/**
	 * test return page
	 * @param int size, int old, RedirectAttributes attr
	 * @return
	 */
	@RequestMapping("mediaInfoModelAttribute.shtml")
	public ModelAndView mediaInfoModelAttribute(
			@ModelAttribute("size") int size,
			@ModelAttribute("old") int old,
			HttpServletRequest request) {
		logger.info("---------------get mediaInfoRedirectAttributes.shtml---------------------");		
		ModelAndView modelAndView = new ModelAndView("com/demo/bean/mediaInfo");
		return modelAndView;
	}
}
