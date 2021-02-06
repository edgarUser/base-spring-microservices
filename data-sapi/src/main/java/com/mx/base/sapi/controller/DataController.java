package com.mx.base.sapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.base.sapi.model.Data;
import com.mx.base.sapi.service.DataService;

@RestController
@RequestMapping("/sapi")
public class DataController {

	@Autowired
	private DataService dataService;

	@GetMapping("/data")
	public Data getData() {
		return dataService.getData();
	}

}