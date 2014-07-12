package com.github.ryankane.standaloneexample.model.util.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.ryankane.standaloneexample.model.entity.Standalone;

public abstract class ListMapper<T, U> extends Mapper<T, U> implements
		CollectionMapper<T, U, List<U>> {
	public List<T> map(List<U> sourceObjects) {
		if (sourceObjects != null) {
			List<T> targetObjects = new ArrayList<T>();

			for (U source : sourceObjects) {
				T target = map(source);

				if (target != null) {
					targetObjects.add(target);
				}
			}

			return targetObjects;
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public List<T> map(Iterable<Standalone> sourceObjects) {
		return map((List<U>) sourceObjects);
	}
}
