/**
 * 
 */
package com.tang.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author tangwei
 * @createDate 2018-07-16
 */

@Controller
@RequestMapping(value = "/pageDispatch")
public class PageController {
	private final static Logger logger = Logger.getLogger(PageController.class.getName());
	
/* -------------about page------------*/
	
	/**
	 * test return page
	 * @param int size, int old, HttpServletReqeust request
	 * @return
	 */
	@RequestMapping("mediaInfo.shtml")
	public ModelAndView mediaInfo(
			@RequestParam(defaultValue = "0") int size,
			@RequestParam(defaultValue = "1") int old,
			HttpServletRequest request) {
		logger.info("---------------get mediaInfo.shtml---------------------");
		ModelAndView modelAndView = new ModelAndView("com/demo/bean/mediaInfo");
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
