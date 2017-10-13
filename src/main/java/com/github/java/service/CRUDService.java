package com.github.java.service;

import java.io.Serializable;
import java.util.List;

public interface CRUDService<E> {

	E save(E entity);
	E getByRepoId(E entity);
	List<E> getAllRepo();
	void delete (Serializable repoId);
}
