package com.github.ryankane.standaloneexample.model.repository;

import java.util.List;

import org.hibernate.Query;
import org.springframework.transaction.annotation.Transactional;

import com.github.ryankane.standaloneexample.model.entity.Standalone;

@Transactional
public class StandaloneRepositoryImpl extends BaseRepositoryImpl<Standalone>
		implements StandaloneRepositoryCustom {
	
	@SuppressWarnings("unchecked")
	public List<Standalone> retrieveAllStandalone() {
		Query query = getSession().createQuery("from Standalone");
		List<Standalone> rs = query.list();
		return rs;
	}

	public Standalone saveStandalone(Standalone standalone) {
		getSession().save(standalone);
		return standalone;
	}
}