package com.kumaran.controller.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kumaran.bean.CountryList;
import com.kumaran.restClient.CountryRestClient;

@Controller
@RequestMapping("/get")
public class WebController {

	@Autowired
	CountryRestClient restClient;

	Logger logger = Logger.getLogger(WebController.class);

	@RequestMapping("/countryList")
	public String getCountries(ModelMap map) {
		logger.debug("Entering clientcode");
		CountryList countries = restClient.getCountries();
		map.addAttribute("countries", countries.getRestResponse().getResult());
		map.addAttribute("message", countries.getRestResponse().getMessages());
		return "countries";
	}
}
