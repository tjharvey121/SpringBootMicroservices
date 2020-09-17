package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tjhar
 * Handle the /start endpoint
 * @return
 */
@Controller
public class PlantPlacesController {
	
	
	
	@RequestMapping("/start")
	public String start() {
		
		return "start";
	}
	
	/**
	 * Handle the /index endpoint
	 * @return
	 */
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
}
