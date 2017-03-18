package com.kumaran.restClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.kumaran.bean.CountryList;

@Component
public class CountryRestClient {

	Logger logger = Logger.getLogger(CountryRestClient.class);

	public CountryList getCountries() {
		logger.debug("Entering clientcode");
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://services.groupkt.com/country/get/all");
		CountryList response = target.request().accept(MediaType.APPLICATION_JSON).get(CountryList.class);
		return response;
	}
}
