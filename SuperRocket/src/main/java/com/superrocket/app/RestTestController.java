package com.superrocket.app;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Handles requests for the application home page.
 */
@RestController
public class RestTestController {
	
	@Autowired
    private RestDAOService restDAOService;
	
	private static final Logger logger = LoggerFactory.getLogger(RestTestController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/restTest")
	//public String restTest() throws Exception {
	public List restTest(@RequestBody String str) throws Exception {
		logger.info("restTest start");
		logger.info("String str : " + str);
		ObjectMapper om = new ObjectMapper();
		// json -> object
		Rest obj = om.readValue(str, Rest.class);
		logger.info("obj.getName : " + obj.getName());
		
		List lst = restDAOService.getRest();
		logger.info("lst.size : " + lst.size());
		
		return lst;
	}
	
	@RequestMapping("/restDbInsertTest")
	//public String restTest() throws Exception {
	public String restDbInsertTest(@RequestBody String str) throws Exception {
		logger.info("restTest start");
		logger.info("String str : " + str);
		ObjectMapper om = new ObjectMapper();
		// json -> object
		Rest obj = om.readValue(str, Rest.class);
		logger.info("obj.getName : " + obj.getName());
		
		restDAOService.insertRest(obj);
		
		return "home";
	}
	
}
