package com.github.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="githubRepoModel")
public class GithubRepoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="repo_id", unique=true,nullable=false)
	private Long repo_id;
	
	@Column(name="repo_name", unique=true,nullable=false)
	private String repo_name;
	
	@Column(name="api_url")
	private String api_url;
	
	@Column(name="username_who_saved_it")
	private String username_who_saved_it;
	
	public String getRepo_name() {
		return repo_name;
	}
	public void setRepo_name(String repo_name) {
		this.repo_name = repo_name;
	}
	public String getApi_url() {
		return api_url;
	}
	public void setApi_url(String api_url) {
		this.api_url = api_url;
	}
	public GithubRepoModel(String repo_name, String api_url, String username_who_saved_it) {
		super();
		this.repo_name = repo_name;
		this.api_url = api_url;
		this.username_who_saved_it = username_who_saved_it;
	}
	public String getUsername_who_saved_it() {
		return username_who_saved_it;
	}
	public void setUsername_who_saved_it(String username_who_saved_it) {
		this.username_who_saved_it = username_who_saved_it;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Id: ").append(this.repo_name).append(", api_url: ").append(this.api_url).append(", user_saved: ")
				.append(this.username_who_saved_it);
		return sb.toString();
	}

}
