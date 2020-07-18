package com.jsware.Seed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsware.Seed.model.Seed;
import com.jsware.Seed.repo.SeedRepo;

@Controller
public class MainController {
	
	@Autowired
	private SeedRepo seedRpo;
	
	
	@RequestMapping(value = "/addToMailList", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object> addToMailList(@RequestBody Seed seed) {
	
		try {
			seedRpo.save(seed);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}
	
	}

}
