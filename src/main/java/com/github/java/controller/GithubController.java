package com.github.java.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.java.model.GithubRepoModel;

public class GithubController {

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<GithubRepoModel> addEmployee(@RequestBody GithubRepoModel githubRepoModel) {
		githubService.save(githubRepoModel);
//		logger.debug("Added:: " + employee);
		return new ResponseEntity<GithubRepoModel>(githubRepoModel, HttpStatus.CREATED);
	}
}
