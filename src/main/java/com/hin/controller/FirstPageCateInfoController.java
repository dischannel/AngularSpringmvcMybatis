package com.hin.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alex.entity.Firstpagecateinfo;
import com.alex.service.FirstPageCateInfoService;
import com.alex.service.beans.FirstPageCateBean;

@Controller
@RequestMapping("/fcate")
public class FirstPageCateInfoController {

	@Resource
	private FirstPageCateInfoService fPageCateService;
	
	@RequestMapping("/firstcategory.json")
    public @ResponseBody List<Firstpagecateinfo> getFpageCateList() {
        return (fPageCateService.getFPageCateInfo());
    }

	
    @RequestMapping(value = "/submitinfo", method = RequestMethod.POST)
    public @ResponseBody void submitInfo(@RequestBody Firstpagecateinfo cateBean,
            HttpServletRequest request) {
    	 	fPageCateService.submitFPageCateInfo(cateBean);
    }
    
    @RequestMapping(value = "/removeinfo", method = RequestMethod.POST)
    public @ResponseBody void removeInfo(@RequestBody Firstpagecateinfo cateinfo,
            HttpServletRequest request) {
    	 	fPageCateService.removeFPageCateInfo(cateinfo);
    }
//    @RequestMapping(value = "/removeUser/{userName}", method = RequestMethod.DELETE)
//    public @ResponseBody void removeUser(@PathVariable("userName") String userName) {
//    	userService.deleteUser(userName);
//    }
//
//    @RequestMapping(value = "/removeAllUsers", method = RequestMethod.DELETE)
//    public @ResponseBody void removeAllUsers() {
//    	userService.deleteAll();
//    }

	
}
