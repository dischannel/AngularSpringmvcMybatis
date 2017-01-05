package com.hin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alex.entity.Allcateinfo;
import com.alex.service.AllCateInfoService;

@Controller
@RequestMapping("/category")
public class AllCateInfoController {

	@Resource
	private AllCateInfoService cateService;
	
	@RequestMapping("/allcategory.json")
    public @ResponseBody List<Allcateinfo> getAllCateList() {
        return (cateService.getAllCateInfo());
    }

	
//    @RequestMapping(value = "/addUser/{userName}", method = RequestMethod.POST)
//    public @ResponseBody void addUser(@PathVariable("userName") String userName) {
//    	userService.addUser(userName);
//    }
//
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
