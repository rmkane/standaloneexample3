package com.github.ryankane.standaloneexample.model.repository;

import java.util.List;

import com.github.ryankane.standaloneexample.model.entity.Standalone;

public interface StandaloneRepositoryCustom {
	List<Standalone> retrieveAllStandalone();
	Standalone saveStandalone(Standalone standalone);
}
