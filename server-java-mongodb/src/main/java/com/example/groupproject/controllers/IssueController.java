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
@RequestMapping("/Issues")
public class IssueController {

	 @Autowired
	  IssueRepository issueRepository;

	  @GetMapping()
	  public List<Issue> getIssues() {
	    return issueRepository.findAll();
	  }

	  @PostMapping()
	  public Issue addProject(@RequestBody Issue issue) {
	    return issueRepository.save(issue);
	  }

	  @DeleteMapping("/{id}")
	  public void deleteIssue(@PathVariable String id) {
	    issueRepository.deleteById(id);
	  }

	  @PutMapping("/{id}")
	  public Issue updateIssue(@PathVariable String id, @RequestBody Issue issue) {
	    Issue foundIssue = issueRepository.findById(id).orElse(null);
	    if (foundIssue != null) {
	    	foundIssue.setName(issue.getName());
	    	foundIssue.setComplete(issue.isComplete());
	      issueRepository.save(foundIssue);
	      return foundIssue;
	    }
	    return null;
	  }
}
