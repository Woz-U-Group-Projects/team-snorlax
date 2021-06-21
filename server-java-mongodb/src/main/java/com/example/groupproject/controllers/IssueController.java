package com.example.groupproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.groupproject.models.Issue;
import com.example.groupproject.models.IssueRepository;

@RestController
@RequestMapping("/")
public class IssueController {

	 @Autowired
	  IssueRepository issueRepository;

	  @GetMapping("/issues")
	  public List<Issue> getIssues() {
	    return issueRepository.findAll();
	  }

	  @PostMapping("/addIssues")
	  public Issue addProject(@RequestBody Issue issue) {
	    return issueRepository.save(issue);
	  }

	  @DeleteMapping("/issues/{id}")
	  public void deleteIssue(@PathVariable Integer id) {
	    issueRepository.deleteById(id);
	  }

	  @PutMapping("/addIssues/{id}")
	  public Issue updateIssue(@PathVariable Integer id, @RequestBody Issue issue) {
	    Issue foundIssue = issueRepository.findById(id).orElse(null);
	    if (foundIssue != null) {
	    	foundIssue.setStatus(issue.getStatus());
	      issueRepository.save(foundIssue);
	      return foundIssue;
	    }
	    return null;
	  }
}
