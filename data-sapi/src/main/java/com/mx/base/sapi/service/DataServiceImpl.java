package com.mx.base.sapi.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mx.base.sapi.model.Data;
import com.mx.base.sapi.repository.DataRepository;

public class DataServiceImpl implements DataService {

	private DataRepository dataRepository;

	@Autowired
	public DataServiceImpl(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	@Override
	public Data getData() {
		return this.dataRepository.findOne();
	}

}
