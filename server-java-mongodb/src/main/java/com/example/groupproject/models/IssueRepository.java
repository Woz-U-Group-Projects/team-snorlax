package com.example.groupproject.models;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IssueRepository extends MongoRepository<Issue, Integer> {

}
