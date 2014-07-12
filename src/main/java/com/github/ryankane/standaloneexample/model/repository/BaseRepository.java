package com.github.ryankane.standaloneexample.model.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.github.ryankane.standaloneexample.model.entity.BaseEntity;

public interface BaseRepository<T extends BaseEntity> extends
		CrudRepository<T, Long>, Serializable {
}
