package com.github.ryankane.standaloneexample.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.ryankane.standaloneexample.model.dto.StandaloneDto;
import com.github.ryankane.standaloneexample.model.entity.Standalone;
import com.github.ryankane.standaloneexample.model.mapper.StandaloneDtoMapper;
import com.github.ryankane.standaloneexample.model.mapper.StandaloneMapper;
import com.github.ryankane.standaloneexample.model.repository.StandaloneRepository;

@Service
public class StandaloneService implements StandaloneLocal {
	@Autowired
	private StandaloneRepository repo;
	@Autowired
	private StandaloneMapper mapper;
	@Autowired
	private StandaloneDtoMapper dtoMapper;
	
	public List<StandaloneDto> retrieveAll() {
		return dtoMapper.map(repo.retrieveAllStandalone());
	}

	public StandaloneDto save(StandaloneDto standalone) {
		Standalone entity = mapper.map(standalone);
		entity = repo.saveStandalone(entity);
		return dtoMapper.map(entity);
	}
}
