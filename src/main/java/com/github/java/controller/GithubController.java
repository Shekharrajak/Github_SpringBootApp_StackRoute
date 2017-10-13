package com.github.java.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.java.model.GithubRepoModel;
import com.github.java.service.abstractclass.GithubServiceAbstract;

@RestController
@RequestMapping("/apiv1")
public class GithubController {

	@Autowired
	private GithubServiceAbstract githubService;
	
	final static Logger logger = Logger.getLogger(GithubController.class);
	
	@RequestMapping(value="/add_repo", method = RequestMethod.POST)
	public ResponseEntity<GithubRepoModel> addEmployee(@RequestBody GithubRepoModel githubRepoModel) {
		githubService.save(githubRepoModel);
//		logger.debug("Added:: " + employee);
		return new ResponseEntity<GithubRepoModel>(githubRepoModel, HttpStatus.CREATED);
	}

	@RequestMapping(value="/get_repos", method=RequestMethod.GET)
	public ResponseEntity<List<GithubRepoModel>> getRepos(){
		List<GithubRepoModel> repos = githubService.getAllRepo();
		if(repos.isEmpty()) {
			return new ResponseEntity<List<GithubRepoModel>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<GithubRepoModel>>(repos, HttpStatus.OK);
	}
}
