package com.vsp.mock;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/UpdateMaster")
public class UpdateMasterController {
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody
	UpdateMaster getUpdateMaster(@PathVariable long id) {

		UpdateMaster updateMaster = new UpdateMaster(id, "This is update master");
		
		System.out.println("MOCK-JBOSS - UpdateMaster - Received a GET Request.");
		
		return updateMaster;

	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> createOrUpdateMaster(@RequestBody String json) {
		
		System.out.println("MOCK-JBOSS - UpdateMaster - Received a POST Request with the following message body: "+json);

	    return new ResponseEntity<String>(json, HttpStatus.OK);
	}

}
