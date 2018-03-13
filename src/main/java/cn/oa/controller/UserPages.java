package cn.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("page")
public class UserPages {
	
	@RequestMapping(value="{view}")
	public ModelAndView page(@PathVariable("view") String viewName){
		return new ModelAndView(viewName);
	}
}
