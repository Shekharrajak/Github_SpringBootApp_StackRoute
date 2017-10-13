package com.github.java.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.github.java.model.GithubRepoModel;
import com.github.java.repository.GithubRepoRepository;
import com.github.java.service.abstractclass.GithubServiceAbstract;

// default service
@Service
public class DefaultGithubService extends GithubServiceAbstract {

	@Autowired
	private GithubRepoRepository repoRepository;
	
	public GithubRepoModel save(GithubRepoModel entity) {
		// TODO Auto-generated method stub
		return repoRepository.save(entity);
	}

	public GithubRepoModel getByRepoId(Serializable repo_id) {
		// TODO Auto-generated method stub
		return repoRepository.findOne((Long) repo_id);
	}

	public List<GithubRepoModel> getAllRepo() {
		// TODO Auto-generated method stub
		return repoRepository.findAll();
	}

	public void delete(Serializable repo_id) {
		// TODO Auto-generated method stub
		repoRepository.delete((Long) repo_id);
		
	}
	
	
// remove this
	@Override
	public GithubRepoModel getByRepoId(GithubRepoModel entity) {
		// TODO Auto-generated method stub
		return null;
	}


}
