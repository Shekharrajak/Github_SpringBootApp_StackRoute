package com.github.java.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.github.java.model.GithubRepoModel;
import com.github.java.service.abstractclass.GithubServiceAbstract;

// default service
@Component
public class GithubService extends GithubServiceAbstract {

	public GithubRepoModel save(GithubRepoModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public GithubRepoModel getByRepoName(GithubRepoModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<GithubRepoModel> getAllRepo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Serializable repoName) {
		// TODO Auto-generated method stub
		
	}


}
